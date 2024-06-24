pipeline {
    agent any

    environment {
        // 필요한 환경 변수를 설정
        TF_VAR_example = 'example_value'
    }

    stages {
        stage('Checkout') {
            steps {
                // Git 리포지토리에서 코드를 체크아웃
                checkout scm
            }
        }

        stage('Setup Terraform') {
            steps {
                // Terraform 설치 (사전 설치된 경우 생략 가능)
                sh 'curl -fsSL https://apt.releases.hashicorp.com/gpg | sudo apt-key add -'
                sh 'sudo apt-add-repository "deb [arch=amd64] https://apt.releases.hashicorp.com $(lsb_release -cs) main"'
                sh 'sudo apt-get update && sudo apt-get install terraform'
            }
        }

        stage('Terraform Init') {
            steps {
                dir('terraform') {
                    // Terraform 초기화
                    sh 'terraform init'
                }
            }
        }

        stage('Terraform Validate') {
            steps {
                dir('terraform') {
                    // Terraform 구성 검증
                    sh 'terraform validate'
                }
            }
        }

        stage('Terraform Plan') {
            steps {
                dir('terraform') {
                    // Terraform 계획 생성
                    sh 'terraform plan'
                }
            }
        }

        stage('Terraform Apply') {
            when {
                branch 'main'
            }
            steps {
                dir('terraform') {
                    // Terraform 적용
                    sh 'terraform apply -auto-approve'
                }
            }
        }
    }

    post {
        always {
            // 빌드 로그를 정리하거나 필요한 후처리 작업
            cleanWs()
        }
    }
}