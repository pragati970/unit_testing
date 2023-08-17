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

        stage('Build and Test') {
            steps {
                // Build the Spring Boot application
                sh 'mvn clean package' // Use './mvnw' for Unix-like systems, or 'mvnw.cmd' for Windows

                // Run integration tests with TestNG
                sh 'mvn test' // This assumes that TestNG tests are configured in your project's pom.xml
            }
        }
         stage('TestNG result') {
            steps {
                // Checkout your source code from version control
                 testNG reportFilenamePattern: './testng-results.xml'
            }
        }

        // Add more stages for other pipeline steps (e.g., deploy, etc.)
    }
}
