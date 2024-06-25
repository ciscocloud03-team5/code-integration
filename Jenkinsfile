pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "your_dockerhub_eleys7485/number-guessing-game"
    }

    stages {
        stage('Checkout') {
            steps {
                // Git 저장소에서 소스 코드를 체크아웃
                git 'https://github.com/your_username/your_repository.git'
            }
        }
        stage('Build') {
            steps {
                script {
                    // Docker 이미지 빌드
                    docker.build("${DOCKER_IMAGE}:${env.BUILD_ID}")
                }
            }
        }
        stage('Push') {
            steps {
                script {
                    // Docker Hub에 로그인 (젠킨스 크리덴셜 사용)
                    docker.withRegistry('https://index.docker.io/v1/', 'dockerhub-credentials-eleys7485') {
                        // Docker 이미지 푸시
                        docker.image("${DOCKER_IMAGE}:${env.BUILD_ID}").push()
                        docker.image("${DOCKER_IMAGE}:${env.BUILD_ID}").push('latest')
                    }
                }
            }
        }
    }
}
