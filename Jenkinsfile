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
        
        // stage('Test') {
        //     steps {
        //         // Add your test steps here
        //         sh 'echo "Testing..."'
        //     }
        // }
        
        stage('Deploy') {
            steps {
                // Add your deployment steps here
                sh 'echo "Deploying..."'
            }
        }
    }
}