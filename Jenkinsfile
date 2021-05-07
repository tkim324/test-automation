pipeline {

    agent {
        docker {
            image 'markhobson/maven-chrome:jdk-11'
            args '-v /appdata/jenkins/mavenrepo:/appdata/jenkins/mavenrepo:rw,z --name test-automation'
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