pipeline {
    agent any

    environment {
        DOCKER_REGISTRY = "docker.io" // Docker 레지스트리
        DOCKERHUB_CREDENTIALS = credentials('pjt-dockerhubtoken') // Jenkins Credentials에 저장된 Docker Hub 자격증명 ID
        APP_NAME = "number-guessing-game" // 애플리케이션 이름
        IMAGE_NAME = "${DOCKER_REGISTRY}/your-dockerhub-username/${APP_NAME}" // Docker 이미지 이름
        IMAGE_TAG = "latest" // 이미지 태그
    }

    stages {
        stage('Build Docker Image') {
            steps {
                script {
                    // Docker 이미지 빌드
                    docker.build("${IMAGE_NAME}:${IMAGE_TAG}", "-f Dockerfile .")
                }
            }
        }

        stage('Run Docker Container') {
            steps {
                script {
                    // Docker 컨테이너 실행
                    docker.withRegistry('', DOCKERHUB_CREDENTIALS) {
                        docker.image("${IMAGE_NAME}:${IMAGE_TAG}").inside {
                            sh 'python number_guessing_game.py'
                        }
                    }
                }
            }
        }
    }
}
