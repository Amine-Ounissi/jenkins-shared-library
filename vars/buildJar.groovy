#!/usr/bin/env groovy

def call() {
    echo "building the application..."
    sh'pwd'
    sh'ls'    
    sh 'JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64'
    sh 'mvn clean package'

    
}
