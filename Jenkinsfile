pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "eleys7485/number-guessing-game"
        GIT_REPO = "https://github.com/ciscocloud03-team5/code-integration.git"
        GIT_TOKEN_CREDENTIALS_ID = "ocr" // 젠킨스에 등록된 GitHub PAT 자격 증명 ID
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    // GitHub PAT을 사용하여 Git 저장소에서 소스 코드를 체크아웃
                    withCredentials([string(credentialsId: "${GIT_TOKEN_CREDENTIALS_ID}", variable: 'GIT_TOKEN')]) {
                        sh '''
                            git clone https://${GIT_TOKEN}@github.com/ciscocloud03-team5/code-integration.git
                            cd code-integration
                        '''
                    }
                }
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
                    docker.withRegistry('https://index.docker.io/v1/', 'dockerhub-credentials-id') {
                        // Docker 이미지 푸시
                        docker.image("${DOCKER_IMAGE}:${env.BUILD_ID}").push()
                        docker.image("${DOCKER_IMAGE}:${env.BUILD_ID}").push('latest')
                    }
                }
            }
        }
    }
}
