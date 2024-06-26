ipeline {
    agent any
    environment {
        GIT_CREDENTIALS = credentials('your-ssh-credential-id')
    }
    stages {
        stage('Checkout SCM') {
            steps {
                checkout([$class: 'GitSCM', 
                          branches: [[name: '*/ocr']], 
                          doGenerateSubmoduleConfigurations: false, 
                          extensions: [], 
                          submoduleCfg: [], 
                          userRemoteConfigs: [[
                              url: 'git@github.com:ciscocloud03-team5/code-integration.git',
                              credentialsId: 'your-ssh-credential-id'
                          ]]
                ])
            }
        }
        // other stages...
    }
}
