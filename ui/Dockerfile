FROM tomcat
LABEL maintainer="savadhan@gmu.edu"
RUN apt-get update && apt-get install -y elinks && apt-get install -y npm && npm install -g @angular/cli && apt-get install -y net-tools
RUN mkdir -p /test
ADD services.sh /test/
ADD UIModuleSWE645Assignment3 /test/UIModuleSWE645Assignment3
WORKDIR /test/
EXPOSE 4200
ENTRYPOINT ["/test/services.sh"]
