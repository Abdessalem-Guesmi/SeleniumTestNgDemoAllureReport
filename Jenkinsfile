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
            
            	 sh 'allure serve allure-results'
            exit 0
        }

   				 
   			
  }
       }
       
       }
    

