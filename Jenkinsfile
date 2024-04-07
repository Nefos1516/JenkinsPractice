pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    git 'https://github.com/Nefos1516/JenkinsPractice.git'
                    bat 'javac ./src/Main.java'
                }
            }
        }

        stage('Run') {
            steps {
                script {
                    bat 'java ./src/Main'
                    bat 'jar cfe Main.jar Main Main.class'
                }
            }
            post {
                success {
                    archiveArtifacts 'artifact.txt'
                    archiveArtifacts '*.jar'
                }
            }
        }
    }
}