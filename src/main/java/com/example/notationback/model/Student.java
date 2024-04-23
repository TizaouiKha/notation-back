package com.example.notationback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "picture")
    private String picture;
    @Column(name = "id_class")
    private Long idClass;

    public Student(String lastName, String firstName, String picture, Long idClass) {
        this.lastName =lastName;
        this.firstName = firstName;
        this.picture = picture;
        this.idClass = idClass;
    }
    public Student(){}
}
