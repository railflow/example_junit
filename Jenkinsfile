pipeline {
    agent {
        label "linux"
    }
    tools {
        maven 'M3' 
    }
     environment {
        RAILFLOW_KEY = credentials('railflow-key')
        TESTRAIL_CREDS = credentials('sergey-testrail')
        TESTRAIL_URL = "https://tr.railflow.io/"        
     }
    stages {
       stage('Build') {
          steps {   
             echo '********BUILD STEP**********'
             git branch: 'main', url: 'https://github.com/railflow/example_junit.git'
             bat 'mvn test'
          }
       }
    }
    post {
     always {
        junit '**/target/surefire-reports/*.xml'        
        echo "Install railflow"
        sh "npm install railflow"
        echo "Begin exporting data to TestRail"
        sh 'railflow -k ${RAILFLOW_KEY} -url ${TESTRAIL_URL} -u ${TESTRAIL_CREDS_USR} -p ${TESTRAIL_CREDS_PSW} -pr \"Railflow Demo\" -path Railflow/Demo/JUnit -f junit -r "target/surefilre-reports/*.xml" -sm path -tp "Railflow Demo JUnit" -cf \"Required text field=something\"'
     }  
    }
}