//package com.example.demo.service;
//
//import com.example.demo.model.Product;
//import com.example.demo.model.Student;
//import com.example.demo.repository.ProductRepository;
//import com.example.demo.repository.StudentRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ProductService {
//
//    private final ProductRepository productRepository;
//
//    public ProductService(ProductRepository studentRepository) {
//        this.productRepository = productRepository;
//    }
//
//    @GetMapping("/all")
//    public List<Product> getAllStudents() {
//        return productRepository.findAll(); //
//    }
//
//    public Product saveStudent(Product product) {
//        return productRepository.save(product);
//    }
//
//    public Student getStudentById(Long id) {
//        return productRepository.findById(id);
//    }
//}
//
