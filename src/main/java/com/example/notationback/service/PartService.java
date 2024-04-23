package com.example.notationback.service;

import com.example.notationback.model.Part;

import java.util.List;
import java.util.Optional;

public interface PartService {
    Part createPart(Part part);

    List<Part> findByIdExam(Long id);

    Part updatePart(Part part);

    Optional<Part> getPartById(Long id);

    void deletePartById(Long id);
}
