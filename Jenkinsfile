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
       }
       stage('report project') {
          steps {
             sh 'allure serve allure-results'
          }
       }
       }
    }

