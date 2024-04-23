package com.example.notationback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "part")
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "grade")
    private Double grade;
    @Column(name = "name")
    private String name;
    @Column(name = "id_exam")
    private Long idExam;

    public Part(Double grade, String name, Long idExam){
        this.grade = grade;
        this.name = name;
        this.idExam = idExam;
    }

    public Part(){}
}
