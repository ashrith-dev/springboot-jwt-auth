# Spring Boot JWT Authentication System

This project is a backend application built using Spring Boot and MySQL that demonstrates secure API development using JWT-based authentication. It follows a layered architecture and includes protected endpoints that require a valid token for access.

## Features

- JWT-based stateless authentication
- Protected REST APIs using a custom JWT filter
- Layered architecture (Controller, Service, Repository)
- MySQL integration using Spring Data JPA
- Persistent data storage

## Tech Stack

- Java
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- MySQL
- JPA / Hibernate

## Project Structure

- Controller: Handles incoming API requests  
- Service: Contains business logic  
- Repository: Handles database operations  
- Entity: Maps Java objects to database tables  
- Security: Handles token generation and validation  

## API Endpoints

### Login

POST /auth/login

Request body:
{
  "name": "admin",
  "email": "admin@example.com"
}

Response:
Returns a JWT token as a string.

### Get Users (Protected)

GET /users

Headers:
Authorization: Bearer <JWT_TOKEN>

Response:
[
  {
    "id": 1,
    "name": "Ashrith",
    "email": "ash@example.com"
  }
]

## Setup Instructions

1. Clone the repository:
git clone https://github.com/ashrith-dev/springboot-jwt-auth.git

2. Configure database in application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/testdb
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

3. Run the application:
./mvnw spring-boot:run

## Authentication Flow

1. User sends login request
2. Server validates credentials and generates a JWT token
3. Client includes the token in the Authorization header
4. JWT filter validates the token for each request
5. Access is granted only if the token is valid

## Future Improvements

- Add role-based access control (USER, ADMIN)
- Store user credentials in the database
- Implement password encryption (BCrypt)
- Add frontend integration

## Author

Ashrith Kumar Penumati
