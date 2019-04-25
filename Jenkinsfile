node {
stage('Checkout ') {
checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [],
userRemoteConfigs: [[url: '']]])
}
stage('SonarQube analysis')
{
def scannerHome = tool 'Sonar Qube';
withSonarQubeEnv('SonarQube') {
sh "C:/'Program Files (x86)'/Jenkins/tools/hudson.plugins.sonar.SonarRunnerInstallation/Sonar_Qube/bin/sonar-scanner"
}
}
}
