package com.admission.studentform.controller;

import com.admission.studentform.entity.StudentEntity;
import com.admission.studentform.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@CrossOrigin("http://localhost:4200")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<StudentEntity> findAllStudent(){
        return studentService.findAllStudent();
    }

    @GetMapping("/{id}")
    public Optional<StudentEntity> findEmployeeById(@PathVariable("id") Long id){
        return studentService.findById(id);
    }

    @PostMapping
    public StudentEntity saveStudent(@RequestBody StudentEntity studentEntity){
        return studentService.saveStudent(studentEntity);
    }

    @PutMapping
    public StudentEntity updateStudent(@RequestBody StudentEntity studentEntity){
        return studentService.updateStudent(studentEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
    }
}
