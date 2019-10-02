#!/bin/bash

rm build.sbt
rm README.md
rm -rf docs
rm -rf gradle
rm -rf gradlew
rm settings.gradle
rm build.gradle
rm  git_push.sh
rm  gradle.properties
rm  gradlew.bat
mv pom.xml pom.xml.old
rm -rf src/

java -jar ../openapi-generator-cli.jar generate -i inventory-swagger.json -g java  -c config.json -o .

rm pom.xml
mv pom.xml.old pom.xml
git add *
