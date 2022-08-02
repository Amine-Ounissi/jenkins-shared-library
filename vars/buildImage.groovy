#!/usr/bin/env groovy

def call() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'nexus-docker-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t 20.225.64.98:8083/registry:amine-registry .'
        sh "echo $PASS | docker login -u $USER --password-stdin 20.225.64.98:8083"
        sh 'docker push 20.225.64.98:8083/registry:amine-registry'
    }
}
