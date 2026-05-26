package com.iti;

def buildImage(String imageName, String imageTag) {
    sh "docker build -t ${imageName}:${imageTag} ."
}

def pushImage(String imageName, String imageTag) {
    sh "docker push ${imageName}:${imageTag}"
}

def dockerLogin(String username, String password) {
    sh 'echo ${password} | docker login -u ${username} --password-stdin'
}