# Spring Boot REST API 

REST API built using **Spring Boot**, **Spring Data JPA**, and **MySQL**. The API provides endpoints for managing cloud vendor information and demonstrates best practices for building scalable and maintainable Java backend services.

## Features

- RESTful endpoints for CRUD operations on cloud vendor data
- Integration with MySQL database using Spring Data JPA
- Layered architecture (Controller, Service, Repository)
- Easy configuration and extensibility

## Prerequisites

- Java 17 or higher
- Maven
- MySQL database

## Getting Started

### 1. Clone the Repository

```sh
git clone <your-repo-url>
cd <repo-directory>
```

### 2. Configure Database Credentials

Edit the `application.yaml` file located at:

```
rest-api/src/main/resources/application.yaml
```

Update the following properties with your MySQL credentials:

```yaml
spring:
    datasource:
        url: jdbc:mysql://localhost:3306/cloud_vendor?useSSL=false
        username: <your-mysql-username>
        password: <your-mysql-password>
    jpa:
        hibernate:
            ddl-auto: create
```

### 3. Build and Run the Application

```sh
cd rest-api
./mvnw spring-boot:run
```
or on Windows:
```sh
mvnw.cmd spring-boot:run
```

The API will be available at [http://localhost:8080](http://localhost:8080).

## API Endpoints

- `GET /cloudvendor` - List all cloud vendors
- `GET /cloudvendor/{vendorID}` - Get a specific cloud vendor
- `POST /cloudvendor/create` - Create a new cloud vendor
- `PUT /cloudvendor/update` - Update an existing cloud vendor
- `DELETE /cloudvendor/delete/{vendorID}` - Delete a cloud vendor

## License

This project is licensed under the Apache License 2.0.

---

**Note:**  
Make sure your MySQL server is running and the database `cloud_vendor` exists (or update the database name in `application.yaml` as needed).
