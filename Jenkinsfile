node {
   
<<<<<<< HEAD
    stage('Checkout Test 1234567') { 
=======
    stage('Checkout Test 1234567') { 
>>>>>>> 54af054f4fd33ad51ff762f9b5368aa0e0de0d3b
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/trsmca/slack3.git']]])
       
    }
      stage('SonarQube analysis') {
    // requires SonarQube Scanner 2.8+ Test
    def scannerHome = tool 'Sonar Qube';
    withSonarQubeEnv('SonarQube') {
         
           sh "C:/'Program Files (x86)'/Jenkins/tools/hudson.plugins.sonar.SonarRunnerInstallation/Sonar_Qube/bin/sonar-scanner"
        
      
  } 
}
     stage('Checkout') { 
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/trsmca/slack3.git']]])
       
    }
    stage('SonarQube analysis') {
    // requires SonarQube Scanner 2.8+
    def scannerHome = tool 'Sonar Qube';
    withSonarQubeEnv('SonarQube') {
         
           sh "C:/'Program Files (x86)'/Jenkins/tools/hudson.plugins.sonar.SonarRunnerInstallation/Sonar_Qube/bin/sonar-scanner"
        
      
  } 
}
}

