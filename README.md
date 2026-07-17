# Spring Boot Demo Application

This is a demonstration Spring Boot application that provides a RESTful API for managing users. 

## Features

- **RESTful API**: Exposes CRUD endpoints for User management (`GET`, `POST`, `PUT`, `DELETE`).
- **Spring Data JPA**: Simplifies database interactions and provides out-of-the-box repository implementations.
- **MySQL Integration**: Configured to connect to a MySQL database (`springboot_demo`).
- **Spring Security**: Secures the application and handles password encoding.
- **SpringDoc OpenAPI (Swagger UI)**: Automatically generates API documentation and provides an interactive UI for testing the endpoints.

## Technologies Used

- Java
- Spring Boot (4.1.0)
- Spring Web MVC
- Spring Data JPA
- Spring Security
- MySQL Connector/J
- SpringDoc OpenAPI
- Maven

## Prerequisites

- Java Development Kit (JDK) compatible with the project configuration (Java 26 specified in pom.xml).
- Maven (included via Maven Wrapper `mvnw`).
- MySQL Server installed and running locally.

## Setup & Installation

1. **Database Configuration**:
   Ensure you have a MySQL server running. The application expects a database named `springboot_demo`. You can update the database credentials in `src/main/resources/application.properties` if needed:
   ```properties
   spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/springboot_demo
   spring.datasource.username=root
   spring.datasource.password=your_password
   ```

2. **Build the Application**:
   Use the Maven wrapper to build the project and download dependencies:
   ```bash
   ./mvnw clean install
   ```
   *(On Windows, use `mvnw.cmd clean install`)*

3. **Run the Application**:
   Start the Spring Boot server:
   ```bash
   ./mvnw spring-boot:run
   ```

## API Endpoints

The User REST API base path is `/api/users`.

| Method   | Endpoint          | Description                                  |
| :------- | :---------------- | :------------------------------------------- |
| `GET`    | `/api/users`      | Fetch all users                              |
| `POST`   | `/api/users`      | Create a new user (password will be encoded) |
| `GET`    | `/api/users/{id}` | Fetch a specific user by ID                  |
| `PUT`    | `/api/users/{id}` | Update an existing user's details            |
| `DELETE` | `/api/users/{id}` | Delete a user by ID                          |

## API Documentation (Swagger UI)

Thanks to `springdoc-openapi-starter-webmvc-ui`, once the application is running, you can access the interactive Swagger UI to explore and test the API endpoints:
- **Swagger UI**: Typically accessible at `http://localhost:8080/swagger-ui.html` or `http://localhost:8080/swagger-ui/index.html` (depending on the exact SpringDoc version).
- **OpenAPI Data**: `http://localhost:8080/v3/api-docs`
