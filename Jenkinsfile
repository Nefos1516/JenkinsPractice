pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    git 'https://github.com/Nefos1516/JenkinsPractice.git'
                    sh '"%JAVA_HOME%/bin/javac.exe" ./src/Main.java'
                }
            }
        }

        stage('Run') {
            steps {
                script {
                    sh '"%JAVA_HOME%/bin/java.exe" ./src/Main.java'
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