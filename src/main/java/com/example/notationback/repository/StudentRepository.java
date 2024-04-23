package com.example.notationback.repository;

import com.example.notationback.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    Optional<Student> findByLastName(String nom);

    List<Student> findByIdClass(Long id);

}
