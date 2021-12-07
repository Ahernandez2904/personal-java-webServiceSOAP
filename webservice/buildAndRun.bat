@echo off
call mvn clean package
call docker build -t com.mycompany/webservice .
call docker rm -f webservice
call docker run -d -p 9080:9080 -p 9443:9443 --name webservice com.mycompany/webservice