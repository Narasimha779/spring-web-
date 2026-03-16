# 🛠️ Spring Boot Product Management Project

## 📖 Overview
This project is a simple **Spring Boot application** that demonstrates:
- REST API development with Spring Web
- Database persistence using Spring Data JPA
- Entity, Repository, Service, and Controller layers
- Sample data initialization with `data.sql`
- GitHub integration for version control

---

## 🚀 Features
- Add new products via REST API
- Fetch all products from the database
- Persistent storage using H2 (file-based) or MySQL
- Auto-loading of sample data at startup
- Clean layered architecture (Controller → Service → Repository → Model)

---

## 📂 Project Structure
springweb/
 ├── src/
 │   ├── main/
 │   │   ├── java/com/springweb/
 │   │   │   ├── controller/
 │   │   │   │    └── ProductController.java     # REST endpoints
 │   │   │   ├── model/
 │   │   │   │    └── Product.java               # Entity class
 │   │   │   ├── repository/
 │   │   │   │    └── ProductRepository.java     # JPA repository
 │   │   │   └── services/
 │   │   │        └── ProductServices.java       # Business logic
 │   │   └── resources/
 │   │        ├── application.properties         # DB + JPA config
 │   │        └── data.sql                       # Sample product data
 │   └── test/java/com/springweb/                # Unit tests (optional)
 ├── pom.xml                                     # Maven dependencies
 └── README.md                                   # Project documentation
