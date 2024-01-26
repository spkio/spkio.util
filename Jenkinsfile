pipeline {

    agent any

    tools {
        maven 'maven 3.9.6'
    }
    
    stages {
        stage('Build') {
            steps {
                // Add your build steps here
                sh 'mvn clean install'
            }
        }
        
        stage('Dokerize') {
            steps {
                script {
                    docker.build("spkio-util", '-f Dockerfile .')
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