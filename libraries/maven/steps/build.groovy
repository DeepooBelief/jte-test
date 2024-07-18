void call(){
    stage("Maven: Build"){
        println "build from the maven library, msg is: ${config.msg}"
    }
}