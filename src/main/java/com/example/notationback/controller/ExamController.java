package com.example.notationback.controller;

import com.example.notationback.model.Class;
import com.example.notationback.model.Exam;
import com.example.notationback.model.Part;
import com.example.notationback.service.ExamService;
import com.example.notationback.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/exam")
public class ExamController {
    @Autowired
    public ExamService examService;

    @GetMapping("/all")
    public List<Exam> getAllExams(){
        return examService.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<Exam> addExam(@RequestBody Exam exam){
        return new ResponseEntity<>(examService.createExam(exam), HttpStatus.CREATED);
    }

    @GetMapping("/find")
    public Optional<Exam> getById(@RequestParam Long id) {
        return examService.findById(id);
    }

    @GetMapping("/findByIdSubject")
    public List<Exam> getByIdSubject(@RequestParam Long id) {
        return examService.findByIdSubject(id);
    }

    @GetMapping("/findByIdStudent")
    public List<Exam> getByIdStudent(@RequestParam Long id) {
        return examService.findByIdStudent(id);
    }

    @GetMapping("/findByIdClass")
    public List<Exam> getByIdClass(@RequestParam Long id) {
        return examService.findByIdClass(id);
    }

    @GetMapping("/delete")
    public String deleteExam(@RequestParam Long id){
        examService.deleteById(id);
        return "Class deleted";
    }
}
