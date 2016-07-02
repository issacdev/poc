####################################
Setup for Tomcat Deploy
####################################
Tomcat-user: set up account with manager right
Maven setting.xml: add server login

mvn tomcat7:deploy
mvn tomcat7:redeploy

http://localhost:8080/springWebApp/HelloDispatcherServlet/hello
http://localhost:8080/springWebApp/HelloJavaServlet
http://localhost:8080/springWebApp/