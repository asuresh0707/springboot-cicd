pipeline {
    agent any
    stages {
        stage('code checkout') {
            steps {
                git url: 'https://github.com/asuresh0707/springboot-cicd.git', branch: 'main'
            }
        }
        stage('compile code') {
            steps {
                sh "./gradlew compileJava"
            }
        }
    }
}