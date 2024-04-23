package com.example.notationback.serviceimp;

import com.example.notationback.model.Class;
import com.example.notationback.repository.ClassRepository;
import com.example.notationback.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    private ClassRepository classRepository;

    @Override
    public List<Class> getAllClasses() {
        return (List<Class>) classRepository.findAll();
    }

    @Override
    public Class createClass(Class c) {
        return classRepository.save(c);
    }

    @Override
    public Optional<Class> getClassById(Long id) {
        return classRepository.findById(id);
    }

    @Override
    public Class updateClass(Class c) {
        return classRepository.save(c);
    }

    @Override
    public void deleteClassById(Long id) {
        classRepository.deleteById(id);
    }
}
