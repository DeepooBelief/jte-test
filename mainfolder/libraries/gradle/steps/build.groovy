void call(){
    stage("Gradle: Build"){
        if (config.msg == null) {
            config.msg = "Hello from Gradle"
        }
        println "build from the gradle library, msg is: ${config.msg}"
    }
}
