pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    git 'https://github.com/Nefos1516/JenkinsPractice.git'
                    sh 'javac ./src/Main.java'
                }
            }
        }

        stage('Run') {
            steps {
                script {
                    sh 'java Main'
                }
            }
            post {
                success {
                    archiveArtifacts artifacts: 'artifact.txt'
                }
            }
        }
    }
}