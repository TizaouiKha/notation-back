package com.example.notationback.service;

import com.example.notationback.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudents();

    Optional<Student> getStudentByLastName(String nom);

    Student  createStudent(Student student);

    Optional<Student> getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);

    List<Student> getByIdClass(Long id);

}
