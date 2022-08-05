pipeline {
    agent any
    
  def _RED='\033[0;31m'  
  def _END='\033[0m'
      stages {
        stage('Example Build') {
            steps {
                echo "_RED tota tuja tuna _END"
            }
        }
    }
}
