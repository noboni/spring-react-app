1.Prerequisites:
    1. Gradle installed
    2. Jdk >=8 installed
    4.node.js installed
    5. mysql installed
2.In ddlScripts folder there is an sql file . Run that sql to get the initial ddl. Please change the below properties
as per your settings in interview\src\main\resources\application.properties  file
spring.datasource.username= root // the username of database
spring.datasource.password= qwe123 // password of the database user

3. Then run 'gradle clean build' from a command prompt
4. Then run 'gradle bootrun' from a command prompt and the backend server is running in port  9091
5. Go to interview\src\main\resources\static\twitter-demo and run 'npm start'
6. so you can see the changes in localhost:3000