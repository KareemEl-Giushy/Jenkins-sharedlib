package com.iti;


def buildProject(comandOption) {
    sh "mvn ${comandOption}"
}

def runTests() {
    sh "mvn test"
}
