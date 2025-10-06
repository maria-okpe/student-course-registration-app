/*Before adding the relationship
package com.example.demo.controller;

import com.example.demo.model.Course;
import com.example.demo.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    // 1️⃣ Show form to add a new course
    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("course", new Course());
        return "course/course-form"; // We'll create this HTML next
    }

    // 2️⃣ Save course
    @PostMapping("/save")
    public String saveCourse(@ModelAttribute Course course) {
        courseService.saveCourse(course);
        return "redirect:/courses/all";
    }

    // 3️⃣ List all courses
    @GetMapping("/all")
    public String listCourses(Model model) {
        model.addAttribute("courses", courseService.findAllCourses());
        return "course/course-list";
    }

    // 4️⃣ View a single course by ID
    @GetMapping("/{id}")
    public String getCourse(@PathVariable UUID id, Model model) {
        Course course = courseService.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found"));
        model.addAttribute("course", course);
        return "course/course-detail";
    }
}
 */



package com.example.demo.controller;

import com.example.demo.model.Course;
import com.example.demo.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    // 2️⃣ Create a course — show form
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("course", new Course());
        return "course/course-form"; // template for adding a new course
    }

    // 2️⃣ Create a course — handle form submit
    @PostMapping("/save")
    public String saveCourse(@ModelAttribute Course course) {
        courseService.saveCourse(course);
        return "redirect:/courses/all"; // after save, go to list page
    }

    // 3️⃣ List all available courses
    @GetMapping("/all")
    public String listCourses(Model model) {
        model.addAttribute("courses", courseService.findAllCourses());
        return "course/course-list";
    }

    // 4️⃣ Fetch a single course by ID
    @GetMapping("/{id}")
    public String getCourse(@PathVariable UUID id, Model model) {
        Course course = courseService.findById(id);
        model.addAttribute("course", course);
        return "course/course-detail";
    }
}
