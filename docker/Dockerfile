# syntax=docker/dockerfile:1
# temp container to build using gradle
FROM gradle:5.6.4-jdk8

RUN apt-get update && apt-get install -y vim

ENV APP_HOME=/usr/app
WORKDIR $APP_HOME
COPY ../ $APP_HOME/

RUN gradle compileJava compileTestJava || return 0
COPY .. .
RUN gradle check pitest

# keep alive
ENTRYPOINT ["tail", "-f", "/dev/null"]
