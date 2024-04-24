package com.example.notationback.service;

import com.example.notationback.model.Class;
import com.example.notationback.model.Subject;

import java.util.List;
import java.util.Optional;

public interface SubjectService {

    List<Subject> getAllSubjects();
    Subject createSubject(Subject subject);

    Subject updateSubject(Subject subject);

    Optional<Subject> getSubjectById(Long id);

    void deleteSubjectById(Long id);
}
