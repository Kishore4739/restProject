# Spring Boot REST API with MongoDB

A simple Spring Boot application that provides CRUD operations using RESTful endpoints and MongoDB as the database.

## 📌 Features

- Create, Read, Update, Delete (CRUD) operations
- MongoDB integration
- RESTful API endpoints
- Layered architecture: Controller, Service, Repository
- Health check endpoint
- Maven-based build system

## 🛠️ Technologies Used

- Java 17+
- Spring Boot
- Spring Data MongoDB
- MongoDB
- Maven

## 📂 Project Structure

restProject/
├── src/
│ └── main/
│ ├── java/com/example/restproject/
│ │ ├── controller/
│ │ ├── service/
│ │ ├── repository/
│ │ └── model/
│ └── resources/
│ └── application.properties
├── pom.xml


## ⚙️ Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/Kishore4739/restProject.git
   cd restProject
2. **Configure MongoDB

   spring.data.mongodb.uri=mongodb://localhost:27017/restdb

3. ** Run the application

     mvn spring-boot:run

4. Access the application

    Health Check: http://localhost:8080/health
    
    CRUD Endpoints: /api/entries (GET, POST, PUT, DELETE)

 ✅ Future Improvements
Add Swagger for API documentation

Implement exception handling with @ControllerAdvice

Add validation with @Valid and @NotBlank

Write unit and integration tests
