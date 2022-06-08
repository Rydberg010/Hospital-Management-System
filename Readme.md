# run this project

# server

Go to application.properties file

add this configuration

spring.datasource.url=jdbc:mysql://localhost:33060/<your_database>
spring.datasource.username=<username>
spring.datasource.password=<password>

or add h2 dependency and remove above config

project will be running in port = 8080

run this project from main => RestApplication.java
  
*Start the server first before starting the application through angular or else there will be WhiteLablePage error

# ---------------------------------------------------------------

# client

open client folder in terminal and install node_modules

  cmd => npm install
  
start the application

  cmd => npm serve --open

project will be running in port = 4200
  
  # ----------------------------------------------------------------
  
##  Technologies Used
  
  # Backend -->
  
  @Maven: 3.8.5
  @Spring Boot
  @JavaSE1.8
  @MySQL DB
  @Postman
  
  # Frontend -->
  
  @Angular CLI: 13.3.7 
  @Node: 16.15.0
  @npm: 8.11.0
  @Bootstrap
  @CSS
  
