// Jenkinsfile

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    // 도커 이미지 빌드
                    docker.build('number-guessing-game')
                }
            }
        }
        stage('Run') {
            steps {
                script {
                    // 도커 컨테이너 실행
                    docker.image('number-guessing-game').inside {
                        sh 'python number_guessing_game.py'
                    }
                }
            }
        }
    }
}
