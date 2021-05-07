pipeline {

    agent {
        docker {
            image 'markhobson/maven-chrome:jdk-11'
            args '-v C:\\Users\\Taemin\\IdeaProjects\\jenkins\\workspace\\test-automation:/appdata:rw,z -w /appdata --name test-automation'
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