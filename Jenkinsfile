pipeline {

    agent any

    tools {
        maven 'maven 3.9.6'
        docker 'docker'
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
                    def dockerHome = tool 'docker'
                    env.PATH = "${dockerHome}/bin:${env.PATH}"
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