package com.example.notationback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "exam")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "type")
    private String type;
    @Column(name = "date")
    private Date date;
    @Column(name = "coefficient")
    private Double coefficient;
    @Column(name = "number_part")
    private Long numberPart;
    @Column(name = "points")
    private Long points;
    @Column(name = "id_subject")
    private Long idSubject;
    @Column(name = "id_class")
    private Long idClass;
    @Column(name = "id_student")
    private Long idStudent;

    public Exam(String type, Date date, Double coefficient, Long numberPart, Long points, Long idSubject, Long idClass, Long idStudent){
        this.type = type;
        this.date = date;
        this.coefficient = coefficient;
        this.numberPart = numberPart;
        this.points = points;
        this.idSubject = idSubject;
        this.idClass = idClass;
        this.idStudent = idStudent;
    }

    public Exam(){}
}
