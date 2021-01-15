pipeline{
    agent any
    stages {
        
        stage('compile project') {
          steps {
   
                  
                  sh 'mvn clean compile'

          }
       }
        stage('test project') {
          steps {
                  
                  sh 'mvn test'
              }
        
                 post {
          always {
            script {
              allure([
                includeProperties: false,
                jdk: '',
                properties: [],
                reportBuildPolicy: 'ALWAYS',
                results: [[path: 'allure-results']]
              ])
            }
          }
        }
       }
       
       }
    }

