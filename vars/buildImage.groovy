#!/usr/bin/env groovy

def call() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'nexus-docker-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t 104.214.55.140:8083/my-job:$IMAGE_NAME .'
        sh "echo $PASS | docker login -u $USER --password-stdin 104.214.55.140:8083"
        sh 'docker push 104.214.55.140:8083/my-job:$IMAGE_NAME'
    }
}
