#!/bin/sh
export $(cat /etc/secrets/.env | xargs)
exec java -jar app.jar
