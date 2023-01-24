pipeline{
  agent any
  stages {
    stage('Build') {
    tools {
maven "Mave"
}
      
            steps {
      
          bat'mvn -B -DskipTests clean package'
            }
      
    }
    stage('Test'){
      steps {
          bat 'mvn test'
      }
      post {
        always {
          junit skipPublishingChecks: true, testResults: 'target/surefire-reports/*.xml'
        }
      }
    }
    stage('Deliver') {
      steps {
          bat 'echo "Delivering project..."'
      }
    }
  }
}
