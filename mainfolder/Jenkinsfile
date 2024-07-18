pipeline {
    agent any
    options { buildDiscarder(logRotator(numToKeepStr: buildNumToKeepStr)) }
    stages {
        stage('Initialize') {
            steps {
                script {
                    if (0) {
                        build()
                    }
                    static_code_analysis()
                }
            }
        }
    }
}
