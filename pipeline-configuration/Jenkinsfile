pipeline {
    agent any
    options { buildDiscarder(logRotator(numToKeepStr: buildNumToKeepStr)) }
    stages {
        stage('Initialize') {
            steps {
                script {
                    build()
                    static_code_analysis()
                }
            }
        }
    }
}
