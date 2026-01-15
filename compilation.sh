#!/bin/bash

javac -d classe */*.java

java -cp .:classe affichage.MainFrame

java -cp .:classe affichage.Receiver.java
