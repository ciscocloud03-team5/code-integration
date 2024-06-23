variable "vpc_name" {
  description = "vpc name"
  default     = "my_vpc"
  type        = string
}

variable "vpc_cidr" {
  description = "vpc ip range"
  default     = "10.0.0.0/16"
  type        = string
}

###

variable "azs" {
  description = "available zone list"
  default     = ["ap-northeast-2a", "ap-northeast-2c"]
  type        = list(string)
}

variable "public_subnet_cidr" {
  description = "public_subnet_cidr list"
  default     = ["10.0.1.0/24", "10.0.2.0/24", "10.0.3.0/24"]
  type        = list(string)
}

variable "private_subnet_cidr" {
  description = "private_subnet_cidr list"
  default     = ["10.0.10.0/24", "10.0.20.0/24", "10.0.30.0/24"]
  type        = list(string)
}

###

