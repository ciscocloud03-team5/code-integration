data "aws_ami" "amazon_linux_2023" {
  most_recent = true
  owners      = ["137112412989"]
  filter {
    name   = "name"
    values = ["al2023-ami-*-x86_64"]
  }
}

resource "aws_launch_template" "worker_node" {
  name_prefix   = "worker_node"
  image_id      = data.aws_ami.amazon_linux_2023.id
  instance_type = "t3.micro"
  key_name      = "eks-key-pair_1"

  block_device_mappings {
    # 이 디바이스 이름은 루트 볼륨을 의미
    device_name = "/dev/xvdb"
    ebs {
      volume_size = 20
      volume_type = "gp2"
    }
  }
}

###

module "eks" {
  source  = "terraform-aws-modules/eks/aws"
  version = "~> 20.0"

  cluster_name    = "my-cluster"
  cluster_version = "1.30"

  #   cluster_endpoint_public_access  = true


  vpc_id                   = module.my_vpc.vpc_id
  subnet_ids               = module.my_vpc.private_subnets
  control_plane_subnet_ids = module.my_vpc.private_subnets


  # eks 생성 유저에 eks admin 액세스 권한 부여 
  enable_cluster_creator_admin_permissions = true

  node_security_group_additional_rules = {
    allow_http_rule = {
      description = "Allow HTTP input to node from outside"
      protocol    = "TCP"
      from_port   = 80
      to_port     = 80
      type        = "ingress"
      cidr_blocks = ["0.0.0.0/0"]
    }
    allow_https_rule = {
      description = "Allow HTTPS input to node from outside"
      protocol    = "TCP"
      from_port   = 443
      to_port     = 443
      type        = "ingress"
      cidr_blocks = ["0.0.0.0/0"]
    }
    allow_eks_local_rule = {
      description = "Allow all of local ingress rules to node"
      protocol    = "TCP"
      from_port   = 0
      to_port     = 65535
      type        = "ingress"
      cidr_blocks = [module.my_vpc.vpc_cidr_block] #페이지 출력 부분 참고해서
    }
  }

  cluster_security_group_additional_rules = {
    allow_bastion_https_rule = {
      description = "Allow HTTPS input to cluster from local"
      protocol    = "TCP"
      from_port   = 443
      to_port     = 443
      type        = "ingress"
      cidr_blocks = [module.my_vpc.vpc_cidr_block]
    }
    allow_bastion_8080_rule = {
      description = "Allow 8080 port input to cluster from local"
      protocol    = "TCP"
      from_port   = 8080
      to_port     = 8080
      type        = "ingress"
      cidr_blocks = [module.my_vpc.vpc_cidr_block]
    }
  }


  eks_managed_node_groups = {
    example = {
      min_size     = 1
      max_size     = 2
      desired_size = 1

      launch_template = {
        id      = aws_launch_template.worker_node.id
        version = "$Latest"
      }
    }
  }



}