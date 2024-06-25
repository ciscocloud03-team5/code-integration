pipeline {
    agent any

    environment {
        DOCKERHUB_CREDENTIALS = credentials('pjt-dockerhubtoken') // Jenkins Credentials에 저장된 Docker Hub 자격증명 ID
        IMAGE_NAME = "your-dockerhub-username/number-guessing-game" // Docker 이미지 이름
        IMAGE_TAG = "latest" // 이미지 태그
    }

    stages {
        stage('Checkout') {
            steps {
                // GitHub에서 소스 코드 체크아웃
                git credentialsId: 'code-integration', // GitHub 자격증명 사용
                    url: 'https://github.com/ciscocloud03-team5/code-integration.git', // GitHub 리포지토리 URL
                    branch: 'ocr' // 브랜치 이름
            }
        }

        stage('Build and Test') {
            steps {
                script {
                    // Docker 이미지 빌드
                    docker.build("${IMAGE_NAME}:${IMAGE_TAG}", "-f Dockerfile .")
                }
            }
        }

        stage('Push to Docker Hub') {
            steps {
                script {
                    // Docker Hub에 로그인 및 이미지 푸시
                    docker.withRegistry('', DOCKERHUB_CREDENTIALS) {
                        docker.image("${IMAGE_NAME}:${IMAGE_TAG}").push()
                    }
                }
            }
        }
    }
}

