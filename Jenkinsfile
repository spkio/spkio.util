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
        
        stage('Build Image') {
            steps {
                script {
                    docker.build("spkio-util:${env.BUILD_ID}", '-f Dockerfile .')
                }
            }
        }
        
        stage('Push Image') {
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
                        dockerImage.push()
                        dockerImage.push("${env.BUILD_ID}")
                    }
                }
            }
        }

        stage('Deploy on Kubernetes') {
            steps {
                script {
                    kubernetesDeploy(
                        configs: 'k8s/*.yml',
                        kubeconfigId: 'k8s',
                        enableConfigSubstitution: true
                    )
                }
            }
        }
    }
}