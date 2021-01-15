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
          }
           stage('deploy project') {
          steps {
                  
                  sh 'mvn deploy'
             
          }
                 post {
          always {
            script {
              allure([
                includeProperties: false,
                jdk: '',
                properties: [],
                reportBuildPolicy: 'ALWAYS',
                results: [[path: 'target/allure-results']]
              ])
            }
          }
        }
       }
       
       }
    }

