pipeline {
    agent any

    stages {

        stage('Compilation') {
            steps {
                echo 'Building the Branch'
                'mvn -B -DskipTests clean package'
            }
        }
        stage('Unit Tests') {
            steps {
                echo 'Testing stage of Jenkins Pipeline'
            }
        }
        stage('Code Coverage') {
            steps {
                echo 'Started Code Coverage Evaluation'
            }
        }
        stage('Deployment') {
            steps {
                echo 'Started Deployment of Generated Artifacts'
            }
        }
    }
}