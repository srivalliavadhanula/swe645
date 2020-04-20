#! /bin/bash
/usr/local/tomcat/bin/catalina.sh start
cd /test/UIModuleSWE645Assignment3/
npm install
ng serve --host 0.0.0.0
tail -f /dev/null
