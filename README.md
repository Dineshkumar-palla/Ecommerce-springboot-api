
# 🛒 E-Commerce REST API Backend

A backend REST API for an E-Commerce system built using **Spring Boot**.  
This project demonstrates a layered architecture with Controller, Service, and Repository layers, implementing CRUD operations for product management.

---

## 🚀 Features

✔ Product CRUD APIs (Create, Read, Update, Delete)  
✔ RESTful API architecture  
✔ Spring Data JPA integration  
✔ H2 in-memory database  
✔ Spring Security configuration  
✔ Layered architecture (Controller → Service → Repository)  
✔ API testing using Postman  

---

## 🧰 Tech Stack

| Technology | Purpose |
|------------|---------|
| Java 21 | Programming language |
| Spring Boot | Backend framework |
| Spring Data JPA | ORM and database access |
| H2 Database | In-memory database |
| Maven | Dependency management |
| Postman | API testing |

---

## 📁 Project Structure
com.ecommerce
│
├── controller
│ └── ProductController
│
├── service
│ └── ProductService
│
├── repository
│ └── ProductRepository
│
├── model
│ └── Product
│
├── config
│ └── SecurityConfig
│
└── EcommerceApiApplication

---

## 🌐 API Endpoints

### Get All Products
GET /api/products


### Get Product By ID
GET /api/products/{id}


### Create Product
POST /api/products


### Update Product
PUT /api/products/{id}


### Delete Product
DELETE /api/products/{id}


---

## ▶ Running the Application

Clone the repository:
git clone https://github.com/yourusername/ecommerce-springboot-api.git


Navigate to the project folder:
cd ecommerce-springboot-api


Run the application:
mvn spring-boot:run


The server will start at:
http://localhost:8080


---

## 🗄 Database Console

This project uses the **H2 in-memory database**.

Open the console:
http://localhost:8080/h2-console


Connection details:
JDBC URL: jdbc:h2:mem:test
User Name: sa
Password: (empty)

Example SQL query:
SELECT * FROM PRODUCT;


---

## 📬 API Testing

APIs can be tested using **Postman**.

Example request:
POST /api/products


Request body:

```json
{
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000,
  "stock": 5
}
```

📌 Future Improvements
JWT Authentication
Order Management System
Cart functionality
Swagger API Documentation
MySQL database integration
Docker containerization

👨‍💻 Author
Dinesh Kumar
Backend Developer (Java | Spring Boot)

⭐ Support
If you like this project, consider giving it a ⭐ on GitHub!


---

# ✨ How This README Looks on GitHub

Your GitHub page will show:

- Title with emoji  
- Clean sections  
- Tables  
- Code blocks  
- API documentation  

This makes the project look **professional and recruiter-friendly**.

---

# 💡 Optional (Makes It Even Better)

Add a **project screenshot** like this in README:

```markdown
## 📸 API Example

![API Screenshot](images/api-example.png)
```
