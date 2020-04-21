FROM tomcat
LABEL maintainer="savadhan@gmu.edu"
RUN apt-get update && apt-get install -y elinks && apt-get install -y npm && npm install -g @angular/cli && apt-get install -y net-tools
RUN mkdir -p /test
WORKDIR /test/UIModuleSWE645Assignment3
ADD UIModuleSWE645Assignment3 /test/UIModuleSWE645Assignment3
CMD echo n|npm install && ng serve --host 0.0.0.0
EXPOSE 4200