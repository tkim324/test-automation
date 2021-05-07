pipeline {

    agent {
        docker {
            image 'markhobson/maven-chrome:jdk-11'
            args '--name test-automation'
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