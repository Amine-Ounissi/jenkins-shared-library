#!/usr/bin/env groovy

def call() {
    echo "building the application..."
    sh 'pwd'
    sh 'ls'  
    sh 'whereis java'
    sh 'echo $JAVA_HOME'
    sh 'mvn clean package'

    
}
