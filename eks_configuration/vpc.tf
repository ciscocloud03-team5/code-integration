module "my_vpc" {
  source = "terraform-aws-modules/vpc/aws"

  name = var.vpc_name
  cidr = var.vpc_cidr

  azs             = var.azs
  public_subnets  = var.public_subnet_cidr
  private_subnets = var.private_subnet_cidr


  tags = {
    Environment = "dev"
    # Add more tags as needed
  }

  enable_nat_gateway     = true
  single_nat_gateway     = false
  one_nat_gateway_per_az = false

  enable_vpn_gateway   = true
  enable_dns_hostnames = true
  enable_dns_support   = true

}

###

resource "aws_security_group" "sg_bastion" {
  name        = "sg_bastion"
  description = "Allow Bastion ec2 inbound traffic and outbound traffic"
  vpc_id      = module.my_vpc.vpc_id

  tags = {
    Name = "sg_bastion"
  }
}

resource "aws_vpc_security_group_ingress_rule" "allow_ssh" {
  security_group_id = aws_security_group.sg_bastion.id
  cidr_ipv4         = "0.0.0.0/0"
  from_port         = 22
  ip_protocol       = "tcp"
  to_port           = 22
}

resource "aws_vpc_security_group_ingress_rule" "allow_http" {
  security_group_id = aws_security_group.sg_bastion.id
  cidr_ipv4         = "0.0.0.0/0"
  from_port         = 80
  ip_protocol       = "tcp"
  to_port           = 80
}

resource "aws_vpc_security_group_ingress_rule" "allow_https" {
  security_group_id = aws_security_group.sg_bastion.id
  cidr_ipv4         = "0.0.0.0/0"
  from_port         = 443
  ip_protocol       = "tcp"
  to_port           = 443
}

resource "aws_vpc_security_group_egress_rule" "allow_all_traffic_ipv4" {
  security_group_id = aws_security_group.sg_bastion.id
  cidr_ipv4         = "0.0.0.0/0"
  ip_protocol       = "-1" # semantically equivalent to all ports
}




data "aws_ami" "Amazon_Linux_2" {
  most_recent = true

  filter {
    name   = "name"
    values = ["amzn2-ami-kernel-5.10-hvm-2.0.*-x86_64-gp2"]
  }

  filter {
    name   = "virtualization-type"
    values = ["hvm"]
  }

  owners = ["137112412989"] # Canonical
}




resource "aws_instance" "bastion-ec2" {
  ami           = data.aws_ami.Amazon_Linux_2.id
  instance_type = "t3.micro"
  associate_public_ip_address = "true"

  key_name      = "eks-key-pair_1"  # 콘솔의 키 페어 부분 생성하면서 다운받아놔서 이름만 입력하면 된다.
  vpc_security_group_ids = [aws_security_group.sg_bastion.id]
  subnet_id = module.my_vpc.public_subnets[1]  # 퍼블릭 서브넷 중 하나 지정

  depends_on = [module.eks]

  user_data = file("bastion_userdata.sh")

  
  tags = {
    Name = "bastion-ec2"
  }
}


