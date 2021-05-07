pipeline {

    agent {
        docker {
            image 'markhobson/maven-chrome:jdk-8'
        }
    }

    stages {
        stage('Execute selenium test'){
            steps {
                sh 'mvn clean test'
            }
        }
    }
}