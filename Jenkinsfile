pipeline {

    agent {
        docker {
            image 'markhobson/maven-chrome:jdk-11'
            args '-v /appdata:/appdata:rw,z -w /appdata --name test-automation'
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