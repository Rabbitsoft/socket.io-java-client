#!/bin/bash
mvn install:install-file -Dfile=WebSocket.jar -DgroupId=org.java_websocket -DartifactId=client -Dversion=1.0 -Dpackaging=jar
