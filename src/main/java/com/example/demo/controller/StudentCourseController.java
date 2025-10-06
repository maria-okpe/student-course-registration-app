package com.example.demo.controller;
import com.example.demo.model.Student;
import com.example.demo.model.Course;
import com.example.demo.model.StudentCourse;
import com.example.demo.service.CourseService;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/student-courses")
public class StudentCourseController {

    private final StudentService studentService;
    private final CourseService courseService;
    private final List<StudentCourse> registrations = new ArrayList<>();

    public StudentCourseController(StudentService studentService, CourseService courseService) {
        this.studentService = studentService;
        this.courseService = courseService;
    }

    // ✅ Register a student to a course
    @PostMapping("/register/{studentId}")
    public String registerStudentToCourse(@PathVariable UUID studentId,
                                          @RequestParam UUID courseId,
                                          Model model) {

        Student student = studentService.findById(studentId);
        Course course = courseService.findById(courseId);

        if (student == null || course == null) {
            model.addAttribute("message", "❌ Invalid student or course.");
            return "student-list";
        }

        StudentCourse registration = new StudentCourse(student.getId(), course.getId());
        registrations.add(registration);

        model.addAttribute("message", "✅ " + student.getFirstName() + " successfully registered for " + course.getName());
        model.addAttribute("registrations", registrations);
        return "registration-list";
    }

    // ✅ View all registrations
    @GetMapping("/all")
    public String getAllRegistrations(Model model) {
        model.addAttribute("registrations", registrations);
        return "registration-list";
    }

    // ✅ List all courses a student is registered for
    @GetMapping("/student/{studentId}/courses")
    public String getCoursesByStudent(@PathVariable UUID studentId, Model model) {
        Student student = studentService.findById(studentId);

        if (student == null) {
            model.addAttribute("errorMessage", "Student not found!");
            return "student-list";
        }

        List<StudentCourse> studentCourses = new ArrayList<>();
        for (StudentCourse sc : registrations) {
            if (sc.getStudentId().equals(studentId)) {
                studentCourses.add(sc);
            }
        }

        model.addAttribute("studentName", student.getFirstName());
        model.addAttribute("studentCourses", studentCourses);
        model.addAttribute("courses", courseService.findAllCourses());
        return "student-courses";
    }

}
