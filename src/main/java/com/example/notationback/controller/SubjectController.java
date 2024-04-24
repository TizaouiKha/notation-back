package com.example.notationback.controller;

import com.example.notationback.model.Class;
import com.example.notationback.model.Exam;
import com.example.notationback.model.Student;
import com.example.notationback.model.Subject;
import com.example.notationback.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    public SubjectService subjectService;

    @GetMapping("/all")
    public List<Subject> getAllSubjects(){
        return subjectService.getAllSubjects();
    }

    @GetMapping("/find")
    public Optional<Subject> getById(@RequestParam Long id) {
        return subjectService.findById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<Subject> addSubject(@RequestBody Subject subject){
        return new ResponseEntity<>(subjectService.createSubject(subject), HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity<Subject> updateSubject(@RequestBody Subject subject){
        var s = subjectService.getSubjectById(subject.getId()).get();
        s.setSubject(subject.getSubject());
        return new ResponseEntity<>(subjectService.updateSubject(s), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Subject> deleteSubject(@RequestParam Long id){
        subjectService.deleteSubjectById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
