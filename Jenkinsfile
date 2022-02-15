pipeline {
    agent {
        docker {
            image 'maven:3.8.1-adoptopenjdk-11'
            args '-v /root/.m2:/root/.m2'
        }
    }
    triggers {
        pollSCM('H/2 * * * *')
    }
    options {
        buildDiscarder(logRotator(numToKeepStr: '1'))
    }
    stages {
        stage('Build') {
            steps {                
                withMaven(maven: 'Maven-3.6.0') {
                    sh "mvn clean package"
                }
            }
        }
    }
}