pipeline {
  agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build and Test') {
            steps {
             sh 'mvn clean compile test'

            }
        }

        stage('Deploy') {
           steps {
                sh 'sh deploy-script.sh'
            }
        }
    }

    post {
        always {
            testNG(testoutput: '**/testng-results.xml')   
        }
    }
}
