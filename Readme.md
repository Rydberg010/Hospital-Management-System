# run this project

# server

Go to application.properties file

add this configuration

spring.datasource.url=jdbc:mysql://localhost:3306/your database
spring.datasource.username=username
spring.datasource.password=password

or add h2 dependency and remove above config

project will be running in port = 8080

run this project from main => RestApplication.java

# ---------------------------------------------------------------

# client

open client folder in terminal and install node_modules

# npm install

cmd => npm start

project will be running in port = 4200