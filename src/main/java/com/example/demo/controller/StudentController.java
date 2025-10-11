
/*And after i add student relationship */

package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.CourseService;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;
    private final CourseService courseService;

    public StudentController(StudentService studentService, CourseService courseService) {
        this.studentService = studentService;
        this.courseService = courseService;
    }

    // ✅ Show form to add a new student
    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "student/student-form";
    }

    // ✅ Save student (POST)
    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        return "redirect:/students/all";
    }

    // ✅ View all students
    @GetMapping("/all")
    public String getAllStudents(Model model) {
        model.addAttribute("students", studentService.findAllStudent());
        return "student/student-list";
    }

    // ✅ View single student details
    @GetMapping("/{id}")
    public String getStudent(@PathVariable UUID id, Model model) {
        Student student = studentService.findById(id);
        model.addAttribute("student", student);
        model.addAttribute("courses", student.getCourses());
        return "student/student-detail";
    }

    // ✅ Show registration form
    @GetMapping("/{id}/register")
    public String showRegistrationForm(@PathVariable UUID id, Model model) {
        Student student = studentService.findById(id);
        model.addAttribute("student", student);
        model.addAttribute("courses", courseService.findAllCourses());
        return "student/student-register-course";
    }

    // ✅ Handle registration form submission
    @PostMapping("/{id}/register")
    public String registerCourse(@PathVariable UUID id, @RequestParam UUID courseId) {
        studentService.registerStudentToCourse(id, courseId);
        return "redirect:/students/" + id;
    }

}

