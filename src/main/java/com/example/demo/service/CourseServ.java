/*package com.example.demo.service;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CourseService {

    private final CourseRepository courseRepository;
    private final StudentRepository studentRepository;

    // Constructor
    public CourseService(CourseRepository courseRepository, StudentRepository studentRepository) {
        this.courseRepository = courseRepository;
        this.studentRepository = studentRepository;
    }

    // 1️⃣ Create a new course
    public void createCourse(Course course) {
        courseRepository.save(course);
    }

    // 2️⃣ List all courses
    public List<Course> listAllCourses() {
        return courseRepository.findAll();
    }

    // 3️⃣ Get one course by code
    public Course getCourseByCode(String code) {
        return courseRepository.findByCourseCode(code);
    }

    // 4️⃣ Register a student for a course
    public void registerStudentToCourse(UUID studentId, UUID courseId) {
        Student student = studentRepository.findById(studentId).orElse(null);
        Course course = courseRepository.findById(courseId).orElse(null);

        // If both exist, add the course to the student's list
        if (student != null && course != null) {
            student.getCourses().add(course);
            studentRepository.save(student);
        }
    }

    // 5️⃣ List all courses taken by a student
    public List<Course> getCoursesByStudentId(UUID studentId) {
        Student student = studentRepository.findById(studentId).orElse(null);

        if (student != null) {
            return new ArrayList<>(student.getCourses());
        }

        // Return empty list if student not found
        return new ArrayList<>();
    }
} */



/*package com.example.demo.service;
import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.stereotype.Service;
import java.util.UUID;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Optional<Course> getCourseById(UUID id) {
        return courseRepository.findById(id);
    }
} */