pipeline {
    agent any

    tools{
        maven 'local_maven'
    }
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code from version control
                checkout scm
            }
        }
        
        stage('Integration Testing') {
            steps {
                // Set up the environment (if needed)
              //  sh 'm install' // Example: Installing dependencies
                
                // Run integration tests
                sh 'UnitTest.java' // Replace with the actual command to run your integration tests
                
                // Archive test results for later viewing in Jenkins
                junit '**/test-reports/*.xml' // Example: JUnit test report
            }
        }
        
        // Add more stages for other pipeline steps (e.g., build, deploy, etc.)
    }
}
