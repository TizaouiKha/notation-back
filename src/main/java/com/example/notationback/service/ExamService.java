package com.example.notationback.service;

import com.example.notationback.model.Exam;

import java.util.List;
import java.util.Optional;

public interface ExamService {

    Exam createExam(Exam exam);

    Optional<Exam> findById(Long id);

    List<Exam> findByIdStudent(Long id);

    List <Exam> findByIdClass(Long id);

    List<Exam> findByIdSubject(Long id);

    void deleteById(Long id);
}
