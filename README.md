# Feedback API

A simple Spring Boot API to collect and view feedback. Built with Java 17, Spring Boot, and PostgreSQL
---

## Tech Used

- Java 17  
- Spring Boot 3.x  
- Spring Data JPA  
- PostgreSQL (can use Supabase)  

---

##  Endpoints
(Can use postman/curl)
###  POST `/feedback`  
Submit feedback.  
**Body:**

```json
{
  "name": "vignesh",
  "email": "vignesh@example.com",
  "comment": "Hello World"
}

```

## GET /feedback
Fetch all feedback entries.
mvn clean install

application.properties

spring.datasource.url=jdbc:postgresql://your-host:5432/postgres
spring.datasource.username=your-username
spring.datasource.password=your-password

```bash
cURL:curl -X POST http://localhost:8080/feedback \
 -H "Content-Type: application/json" \
 -d '{"name":"vignesh", "email":"vignesh@example.com", "comment":"Hiii"}'

##  How to Run the Project

```bash
# Run with Maven
mvn spring-boot:run
```

```bash
mvn test
