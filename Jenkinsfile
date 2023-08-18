pipeline {
  agent any
    stages {
        stage('Checkout') {
            steps {
             git branch: 'main', url: 'https://github.com/pragati970/unit_testing.git'
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
            testNG(testresults: '**/testng-results.xml')   
        }
    }
}
