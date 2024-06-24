// Jenkinsfile
pipeline {
    agent any

    stages {
        stage('Build Docker Image') {
            steps {
                script {
                    dockerImage = docker.build("minecraft-server:latest")
                }
            }
        }

        stage('Run Docker Container') {
            steps {
                script {
                    dockerImage.run("-p 25565:25565 -v $WORKSPACE/data:/data")
                }
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}
