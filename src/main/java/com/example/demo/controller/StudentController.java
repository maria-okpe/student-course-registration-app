/*Before i add student relationship
package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Show form to add a new student
    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "student-form"; // Thymeleaf template
    }

    // Save student (POST from form)
    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        return "redirect:/students/all"; // redirect to list view
    }

    // View a single student by firstName
    @GetMapping("/{firstName}")
    public String getStudent(@PathVariable String firstName, Model model) {
        Student student = studentService.findByName(firstName);

        if (student == null) {
            // If student not found, add error message and redirect to list
            model.addAttribute("errorMessage", "Student with first name '" + firstName + "' not found.");
            model.addAttribute("students", studentService.findAllStudent());
            return "student-list"; // show list with error
        }

        model.addAttribute("student", student);
        return "student-detail"; // Thymeleaf template
    }

    // View all students
    @GetMapping("/all")
    public String getAllStudents(Model model) {
        model.addAttribute("students", studentService.findAllStudent());
        return "student-list"; // Thymeleaf template

    }
} */

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

