# Student–Course Registration App

A Java Spring MVC application for managing students and their course registrations.
It allows creating students and courses, registering students for courses, and viewing course lists for each student.
The project follows a clean architecture approach and uses UUIDs for entity identifiers.

---

## Features

* Create and manage students
* Create and manage courses
* View all students and courses
* Register a student for one or more courses
* View all courses taken by a student
* Simple Thymeleaf-based user interface

---

## Technologies Used

* **Java Spring Boot (Spring MVC)**
* **Thymeleaf** for front-end templates
* **Maven** for build management
* **Lombok** for cleaner and shorter code
* **UUID** for unique entity identifiers
* **H2 (in-memory)** database

---

## Endpoints Overview

| Action                        | HTTP Method | Example Endpoint                               |
| ----------------------------- | ----------- | ---------------------------------------------- |
| Create Student                | POST        | `/students/new`                                |
| Create Course                 | POST        | `/courses/new`                                 |
| List All Courses              | GET         | `/courses/all`                                 |
| Fetch One Course              | GET         | `/courses/{id}`                                |
| Register Student for a Course | POST        | `/student-courses/register/{studentId}`        |
| List Courses by Student       | GET         | `/student-courses/student/{studentId}/courses` |

---

## Getting Started

1. Clone this repository

   ```bash
   git clone https://github.com/maria-okpe/student-course-registration-app.git
   ```
2. Open in your preferred IDE (IntelliJ, Eclipse, or VS Code).
3. Run the application with Maven or your IDE’s Spring Boot runner.
4. Access it at

   ```
   http://localhost:8080/students/new
   ```

---


### 📬 Connect with Me

I'm always open to opportunities, collaboration, or feedback.  
You can reach me through the following channels:

📧 Email: [mariaokpe12@gmail.com](mailto:mariaokpe12@gmail.com)

💻 GitHub: [https://github.com/maria-okpe/student-course-registration-app](https://github.com/maria-okpe/student-course-registration-app/tree/main)

🔗Linkdin: https://www.linkedin.com/in/maria-okpe-280046270/?originalSubdomain=ng


---

*Developed to demonstrate understanding of Spring MVC, clean architecture, and entity relationships.*
