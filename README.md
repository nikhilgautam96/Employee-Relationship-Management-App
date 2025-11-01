## 🧑‍💼 Employee Relationship Management App (Backend API)

- A **Spring Boot–based RESTful API** for managing employees within an organization.  
- This application provides full **CRUD (Create, Read, Update, Delete)** functionality and follows clean architectural practices using **Spring Boot, Spring Data JPA, and MySQL**.

## 👨‍💻 Author

**Nikhil Gautam:**
Java | Spring Boot | React | AWS | Microservices
📧 [Email me](mailto:nikhilgautam1729@gmail.com)
🌐 [LinkedIn](https://www.linkedin.com/in/nikhilgautam96/)
💻 [GitHub](https://github.com/nikhilgautam96)

---

## 🚀 Features

-   Add new employee records
-   Retrieve all employees or fetch by ID
-   Update employee details (partial or full updates)
-   Delete employees by ID
-   Follows layered architecture — `Controller → Service → Repository → Entity`
-   Clean error handling and use of `Optional` for null safety
-   Uses `Spring Data JPA` for ORM and database interactions
-   Configurable database connection through `application.properties`

---

## 🏗️ Tech Stack

| Layer                 | Technology      |
| --------------------- | --------------- |
| **Backend Framework** | Spring Boot     |
| **Data Access Layer** | Spring Data JPA |
| **Database**          | MySQL           |
| **Build Tool**        | Maven           |
| **Language**          | Java 17+        |
| **API Testing**       | Postman / cURL  |
| **Server Port**       | 9999            |

---

## 📂 Project Structure

```
src/
└── main/
├── java/
│    └── in/example/nikhil/
│         ├── controller/           # REST controllers
│         ├── entity/               # JPA entity classes
│         ├── repository/           # DAO interfaces
│         ├── service/              # Service interfaces & implementations
│         └── SpringRestEmployeeRelationshipManagementAppApplication.java
└── resources/
├── application.properties     # DB & server config
└── static / templates (if any)

```

---

## ⚙️ Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/nikhilgautam96/Employee-Relationship-Management-App.git

cd EmployeeRelationshipManagementApp
```

### 2. Configure the Database

Update `src/main/resources/application.properties` with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/<your-database>
spring.datasource.username=<your-username>
spring.datasource.password=<your-password>
spring.jpa.hibernate.ddl-auto=update
```

### 3. Build & Run the Application

```bash
mvn clean install
mvn spring-boot:run
```

The server will start at:
👉 **[http://localhost:9999](http://localhost:9999)**

---

## 📡 API Endpoints

| Method   | Endpoint                            | Description              |
| -------- | ----------------------------------- | ------------------------ |
| `GET`    | `/employee/get-all-employees`       | Fetch all employees      |
| `GET`    | `/employee/get-employee-by-id/{id}` | Get employee by ID       |
| `POST`   | `/employee/register`                | Add a new employee       |
| `PUT`    | `/employee/update/{id}`             | Update existing employee |
| `DELETE` | `/employee/delete?id={id}`          | Delete employee by ID    |

### 📘 Example JSON Request for POST/PUT

```json
{
    "firstName": "Nikhil",
    "lastName": "Gautam",
    "email": "nikhil@example.com",
    "address": "Bangalore, India"
}
```

---

## 🧩 Entity Overview

**Employee.java**

```java
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eid;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
}
```

---

## 🧠 Learning Highlights

-   Implemented **Spring Boot CRUD APIs** from scratch
-   Followed **MVC + layered architecture**
-   Used **Spring Data JPA** with **MySQL** for persistence
-   Implemented **error handling** and **partial updates** in `PUT` request
-   Demonstrates **real-world backend design** with service abstraction and clean code

---

## 📈 Future Enhancements

-   Add **pagination and sorting** for employee retrieval
-   Integrate **Spring Validation** for input validation
-   Add **global exception handling** with `@ControllerAdvice`
-   Implement **JWT authentication** and user roles
-   Connect with a **React frontend** for full-stack demonstration

---
