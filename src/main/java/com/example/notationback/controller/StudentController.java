package com.example.notationback.controller;

import com.example.notationback.model.Class;
import com.example.notationback.model.Student;
import com.example.notationback.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    public StudentService studentService;

    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    
    @GetMapping("/findByNom")
    public Optional<Student> getStudentByNom(@RequestParam String nom){
        return studentService.getStudentByLastName(nom);
    }
    @GetMapping("/find")
    public Optional<Student> getStudentByNom(@RequestParam Long id){
        return studentService.getStudentById(id);
    }

    @GetMapping("/findByIdClassNull")
    public List<Student> getStudentsByIdClassNull(){
        return studentService.getStudentByIdClassNull();
    }

    @GetMapping("/findByIdClass")
    public List<Student> getStudentByIdClass(@RequestParam Long idClass){
        return studentService.getByIdClass(idClass);
    }

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        return new ResponseEntity<>(studentService.createStudent(student), HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student){
        var student2 = studentService.getStudentById(student.getId()).get();
        student2.setLastName(student.getLastName());
        student2.setFirstName(student.getFirstName());
        student2.setPicture(student.getPicture());
        student2.setIdClass(student.getIdClass());
        return new ResponseEntity<>(studentService.updateStudent(student2), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Student> deleteStudent(@RequestParam Long id){
        studentService.deleteStudentById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
