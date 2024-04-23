package com.example.notationback.controller;

import com.example.notationback.model.Class;
import com.example.notationback.model.Part;
import com.example.notationback.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/part")
public class PartController {
    @Autowired
    public PartService partService;

    @PostMapping("/add")
    public ResponseEntity<Part> addClass(@RequestBody Part part){
        return new ResponseEntity<>(partService.createPart(part), HttpStatus.CREATED);
    }

    @GetMapping("/findByIdExam")
    public List<Part> getByIdExam(@RequestParam Long id) {
        return partService.findByIdExam(id);
    }

    @PostMapping("/update")
    public ResponseEntity<Part> updateClass(@RequestBody Part part){
        var p = partService.getPartById(part.getId()).get();
        p.setName(part.getName());
        p.setGrade(part.getGrade());
        p.setIdExam(part.getIdExam());
        return new ResponseEntity<>(partService.updatePart(p), HttpStatus.CREATED);
    }

    @GetMapping("/delete")
    public String deletePart(@RequestParam Long id){
        partService.deletePartById(id);
        return "Class deleted";
    }

}
