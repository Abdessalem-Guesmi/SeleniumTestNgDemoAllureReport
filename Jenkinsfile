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
        stage('Report') {
        steps{
            
            	allure([results: [[path: 'allure-results']]])
            
        }

   				 
   			
  }
       }
       
       }
    

