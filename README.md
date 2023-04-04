# Sales-spring-boot
## This just a simple API - using spring boot 

### Quick Start

1. open project by your java editor and install all dependencies by mvn.

2. change your database info in sales-spring-boot/src/main/resources/application.yml .

        spring:
            datasource:
                url: jdbc:mysql://localhost:3306/{DatabaseName}
                username: {DatabaseUser}
                password: {password}
3. run the project
4. open in your browser http://localhost:9090/

### This project use :

-  java.version v 17
-  spring boot v 3
-  mysql

### end point available 

| url                      | type   | description                                           |
|--------------------------|--------|-------------------------------------------------------|
| /fixed-product-info      | Get    | this end point return fixed json data for product     |
| /customers               | Get    | this end point return all customers data from database |
| /customers               | Post   | this end point can add new customer                   |
| /customers/{customerID}  | Get    | this end point get specific customer data             |
| /customers/{customerID}  | Put    | this end point update specific customer data          |
| /customers/{customerID}  | Delete | this end point delete specific customer data          |

#### example for request data for insert new customer
      {
         "name": "customer one",
         "email": "customerone@gmail.com",
         "age": 20
      }

#### notes
- the project will create needed database table
- every run for the project data will be reset (for demo use )