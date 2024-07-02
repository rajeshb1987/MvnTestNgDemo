pipeline {
    agent any
    
    

    stages {
        
        
        stage('Get Source Code') {
            steps {
                git credentialsId: 'UNPWD', url: 'https://github.com/rajeshb1987/MvnTestNgDemo.git'
            }
        }
        stage('Build code'){
            steps{
                bat script: 'mvn clean compile'
            }
        }
        stage('Run test'){
            steps{
                bat script:'mvn clean test -Dbrowser=$browser'
            }
        }
        stage('Publish Report'){
            steps{
                publishHTML([allowMissing: false, alwaysLinkToLastBuild: true, keepAll: true, reportDir: '', reportFiles: 'target/surefire-reports/emailable*.html', reportName: 'HTML ReportCI', reportTitles: '', useWrapperFileDirectly: true])
            }
        }
    }
}
