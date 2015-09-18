#ARC (Awesome RESTful Core)

This project is intended to create a kickass web application core project offering common web application features like records management (entity CRUD operations), user management, mobile REST API support, and many more.

This will serve as the compilation of the skills I've earned for the past two years that I've been working on web applications as a Java Developer.

This project uses *Spring Core, MVC, and Data*, *Hibernate*, and *Logback* for logging.

#Features

#### Spring Profiles
Many projects that I have encountered are not really giving great importance to the different configuration of the project per each different environments (i.e. development, testing, and production). As a result, the structure of the configuration files and many environment specific resources are not properly organized.

For instance, you have the file `application.properties` as property file of your project. It contains the database connectivity configuration values such as the database url, username, and password of the db user. However, your database configuration in your local machine (development) is different than in your staging server (testing), and is also different in your production. Many of the developers handle this issue by modifying the project each time that it needs to be deployed in a certain environment. Ughhh such a hassle and error prone process. 

ARC knows the dilemma. That's why it has three different directories (i.e. development, testing, and production) representing the different environments per each directory. 

This [article](https://diarmuidmoloney.wordpress.com/2012/04/07/spring-environments/) can make you understand more how awesome spring profiles is.

