pipeline {

    agent any

    tools {
        maven 'maven 3.9.6'
    }
    
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        
        stage('Dokerize') {
            steps {
                script {
                    docker.build("spkio-util:${env.BUILD_ID}", '-f Dockerfile .')
                }
            }
        }
        
        stage('Deploy') {
            
            steps {
                // Add your deployment steps here
                sh 'echo "Deploying..."'
            }
        }

        stage('Deliver') {
            steps {
                // Add your delivery steps here
                sh 'echo "Delivering..."'
            }
        }
    }
}