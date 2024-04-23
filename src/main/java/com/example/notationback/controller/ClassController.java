package com.example.notationback.controller;

import com.example.notationback.model.Class;
import com.example.notationback.model.Student;
import com.example.notationback.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/class")
public class ClassController {
    @Autowired
    public ClassService classService;

    @GetMapping("/all")
    public List<Class> getAllClasses(){
        return classService.getAllClasses();
    }

    @PostMapping("/add")
    public ResponseEntity<Class> addClass(@RequestBody Class c){
        return new ResponseEntity<>(classService.createClass(c), HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity<Class> updateClass(@RequestBody Class c){
        var c1 = classService.getClassById(c.getId()).get();
        c1.setName(c.getName());
        return new ResponseEntity<>(classService.updateClass(c1), HttpStatus.CREATED);
    }

    @GetMapping("/delete")
    public String deleteClass(@RequestParam Long id){
        classService.deleteClassById(id);
        return "Class deleted";
    }
}
