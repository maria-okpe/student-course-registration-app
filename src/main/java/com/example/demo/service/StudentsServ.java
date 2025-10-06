/*package com.example.demo.service;

import com.example.demo.model.StudentModel;
import com.example.demo.repository.StudentsRepo;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentsServ {
    private final StudentsRepo studentsRepo;

    public StudentsServ(StudentsRepo studentsRepo){
        this.studentsRepo = studentsRepo;
    }

    //Add new student
   public StudentModel addStudent(StudentModel studentModel){
        return studentsRepo.save(studentModel);
   }

   //list all student
    public List<StudentModel> getAllStudent(){
        return studentsRepo.findAll();
    }

    //find student by id
    public StudentModel getStudentById(Long id) {
        return studentsRepo.getById(id);
    }
} */
