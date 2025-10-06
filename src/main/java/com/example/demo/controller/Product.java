//package com.example.demo.controller;
//
//import com.example.demo.model.Product;
//import com.example.demo.model.Student;
//import com.example.demo.service.ProductService;
//import com.example.demo.service.StudentService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/products")
//public class ProductController {
//
//    private final ProductService productService;
//
//    public ProductController(ProductService productService) {
//        this.productService = productService;
//    }
//
//    @GetMapping("/all")
//    public List<Product> getAllStudents() {
//        return productService.getAllStudents();
//    }
//
//    @PostMapping("/add")
//    public Product addStudent(@RequestBody Product product) {
//        return productService.saveProduct(product);
//    }
//
//
//    @GetMapping("/{id}")
//    public Product getStudentById(@PathVariable Long id) {
//        return productService.getProductById(id);
//    }
//}
//
