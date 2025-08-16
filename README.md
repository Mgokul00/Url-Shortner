# URL Shortener 🔗

A simple in-memory URL shortener built with **Spring Boot** and **Thymeleaf**.

## Features
- Shorten long URLs to short codes
- Redirect using the short code
- In-memory storage (no database)
- Clean Bootstrap UI

## Tech Stack
- Java + Spring Boot
- Thymeleaf + Bootstrap
- Maven

## Run the Project
```bash
mvn spring-boot:run
```
Then open [http://localhost:8080](http://localhost:8080)

## Limitation
URLs are not persistent. They disappear after server restart.
