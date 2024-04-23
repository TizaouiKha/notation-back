package com.example.notationback.repository;

import com.example.notationback.model.Exam;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExamRepository extends CrudRepository<Exam, Long> {
    List<Exam> findByIdStudent(Long id);

    List<Exam> findByIdClass(Long id);

    List<Exam> findByIdSubject(Long id);
}
