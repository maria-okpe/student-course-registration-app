# 🎓 Student Course Registration App

A **Spring MVC Java web application** that demonstrates a clean and scalable architecture for managing students and courses.
This project showcases the **relationship between Students and Courses**, allowing users to create, view, and register students for multiple courses.

It’s built following **Clean Architecture principles**, using **UUID** for unique identifiers and **Lombok** to keep the code concise and readable.

---

##  Project Preview

###  Student List Page

Shows all registered students with their details and actions.
![Student List Screenshot](images/student-list.png)

###   Student Detail Page

Displays a single student’s information and their registered courses.
![Student Detail Screenshot](images/student-detail.png)

### 🧑‍🎓 Register Course Page

Allows you to register a student for available courses from a dropdown menu.
![Register Course Screenshot](images/register-course.png)

*(After uploading to GitHub, place your screenshots inside a folder named `/images` and update the paths above.)*

---

## 🚀 Features & Endpoints

## 👩‍🎓 Student Management

1. **Create a Student**
   Saves a student into a map using the student's **first name** as the key.
   **Endpoint:**

   ```
   POST /students/save
   ```

2. **Get One Student (by first name)**
   Retrieves a single student using their first name from the map.
   **Endpoint:**

   ```
   GET /students/{firstName}
   ```

3. **List All Students**
   Returns all students in the system as a list.
   **Endpoint:**

   ```
   GET /students/all
   ```

---

### 📘 Course Management

4. **Create a Course**
   Adds a new course with name and description.
   **Endpoint:**

   ```
   POST /courses/save
   ```

5. **List All Courses**
   Shows all available courses.
   **Endpoint:**

   ```
   GET /courses/all
   ```

6. **Fetch One Course (by ID)**
   Retrieves a specific course’s details.
   **Endpoint:**

   ```
   GET /courses/{id}
   ```

---

### 🔗 Student–Course Relationship

7. **Register a Student for a Course**
   Enables a student to register for available courses.
   **Endpoint:**

   ```
   POST /students/{id}/register
   ```

8. **List All Courses Taken by a Student**
   Shows all courses a particular student has registered for.
   **Endpoint:**

   ```
   GET /student-courses/student/{studentId}/courses
   ```

---

## 🧩 Architecture Overview

The project follows **Clean Architecture**, ensuring scalability, modularity, and testability.

### Folder Structure

```
src/main/java/com/example/demo/
│
├── controller/       → Handles HTTP requests (Spring MVC)
├── model/            → Entity classes (Student, Course, StudentCourse)
├── service/          → Business logic (StudentService, CourseService)
├── repository/       → Data access (in-memory map/lists)
└── templates/        → Thymeleaf templates (student & course views)
```

---

## 🛠️ Technologies Used

| Technology            | Description                                 |
| --------------------- | ------------------------------------------- |
| **Java 17+**          | Core language                               |
| **Spring Boot / MVC** | Framework for building web apps             |
| **Thymeleaf**         | Template engine for rendering dynamic views |
| **Lombok**            | Reduces boilerplate code                    |
| **UUID**              | Unique identifiers for students and courses |
| **Maven**             | Dependency management & build tool          |

---

## 💡 Design Highlights

* **Lombok** annotations (`@Getter`, `@Setter`, `@NoArgsConstructor`) simplify code.
* **UUIDs** provide secure, globally unique identifiers.
* **Clean Architecture** ensures separation of concerns and easy maintenance.
* **Thymeleaf integration** connects the backend to a dynamic UI.
* **Fully functional endpoints** tested and verified.

---

## 🧪 Running the Application

### Step 1: Clone the Repository

```bash
git clone https://github.com/maria-okpe/student-course-registration-app/tree/main
cd student-course-registration-app
```

### Step 2: Run with Maven

```bash
mvn spring-boot:run
```

### Step 3: Open in Browser

```
http://localhost:8080/students/all
```

---

## 📊 Sample Data Flow

1. Create a new student → visible in the Student List.
2. Click **View** → view student details.
3. Click **Register for Course** → select a course from the dropdown.
4. See all registered courses displayed in a table.

Example Table:

| Course Name          | Description                 |
| -------------------- | --------------------------- |
| English Language     | What is Tense               |
| Software Engineering | Introduction to Programming |

---

## 🧑‍💻 Author

**Maria Okpe**
Spring MVC Developer | Java Enthusiast | Backend Engineer in Training

 📧 Email: [mariaokpe12@gmail.com](mariaokpe12@gmail.com)

🌐 GitHub: [https://github.com/maria-okpe/student-course-registration-app/tree/main](https://github.com/maria-okpe/student-course-registration-app/tree/main)

---

## ⭐ Summary

This project is a **complete Spring MVC student-course management system** built using best Java practices and a clean modular structure.
It demonstrates:

* Strong grasp of MVC design patterns
* Clean code structure with Lombok and UUIDs
* Fully functional CRUD endpoints
* Frontend integration using Thymeleaf

> 🌟 Star this repository if you found it helpful or inspiring!

