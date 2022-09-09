#!/usr/bin/env groovy

def call() {
    echo 'deploying  the docker image..."
    //withKubeConfig([credentialsId: 'kubeconfig-raw', serverUrl: '']) {
        sh 'kubectl apply -f deployment.yaml'
        sh 'kubectl get deployment'
        sh 'kubectl get pods'
        sh 'kubectl get svc'
    }
}
