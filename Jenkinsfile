pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // HTML 파일 빌드 등의 작업 수행
            }
        }
        stage('Docker Build & Push') {
            steps {
                script {
                    def dockerImage = docker.build('your-docker-image-name')
                    docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
                        dockerImage.push()
                    }
                }
            }
        }
        stage('Deploy') {
            steps {
                // 배포 스크립트 실행 (예: SSH를 통한 배포)
            }
        }
    }

    post {
        always {
            // 자원 정리 등
        }
    }
}
