FROM tomcat
LABEL maintainer="savadhan@gmu.edu"
RUN apt-get update && apt-get install -y elinks && apt-get install -y npm && npm install -g @angular/cli && apt-get install -y net-tools
ADD Assignment3_Rest.war /usr/local/tomcat/webapps
WORKDIR /usr/local/tomcat/bin/
CMD ["catalina.sh","run"]
EXPOSE 8080
