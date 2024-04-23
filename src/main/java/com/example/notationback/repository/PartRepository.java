package com.example.notationback.repository;

import com.example.notationback.model.Class;
import com.example.notationback.model.Part;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartRepository extends CrudRepository<Part, Long> {
    List<Part> findByIdExam(Long id);
}
