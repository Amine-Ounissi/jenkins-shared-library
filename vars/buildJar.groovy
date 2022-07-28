#!/usr/bin/env groovy

def call() {
    echo "building the application..."
    sh 'pwd'
    sh 'ls'
    sh 'java -version'
    sh 'whereis java'
    sh 'whereis maven'
    sh 'echo $JAVA_HOME'
    /*sh 'mvn clean package'*/

    
}
