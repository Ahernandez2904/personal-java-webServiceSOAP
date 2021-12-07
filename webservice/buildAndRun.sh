#!/bin/sh
mvn clean package && docker build -t com.mycompany/webservice .
docker rm -f webservice || true && docker run -d -p 9080:9080 -p 9443:9443 --name webservice com.mycompany/webservice