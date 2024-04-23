package com.example.notationback.service;

import com.example.notationback.model.Class;
import com.example.notationback.model.Student;

import java.util.List;
import java.util.Optional;

public interface ClassService {

    List<Class> getAllClasses();

    Class createClass(Class c);

    Optional<Class> getClassById(Long id);

    Class updateClass(Class c);

    void deleteClassById(Long id);
}
