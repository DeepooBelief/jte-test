void call(){
    stage("Gradle: Build"){
        println "build from the gradle library, msg is: ${config.msg}"
    }
}
