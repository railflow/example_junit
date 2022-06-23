pipeline {
    agent {
        label "linux"
    }
    tools {
        maven 'M3' 
    }    
    stages {
       stage('Build') {
          steps {   
             echo '********BUILD STEP**********'
             git branch: 'main', url: 'https://github.com/railflow/example_junit.git'
             sh 'mvn test'
          }
       }
    }
    post {
     always {
        junit '**/target/surefire-reports/*.xml'                
     }  
    }
}