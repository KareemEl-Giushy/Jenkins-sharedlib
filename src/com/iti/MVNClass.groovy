package com.iti;

class MVNClass {
    def buildProject(comandOption) {
        sh "mvn ${comandOption}"
    }

    def runTests() {
        sh "mvn test"
    }
}