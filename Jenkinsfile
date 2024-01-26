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
                // Add your test steps here
                sh 'docker build -t spkio-util .'
            }
        }
        
        stage('Deploy') {
            
            steps {
                // Add your deployment steps here
                sh 'echo "Deploying..."'
            }
        }
    }
}