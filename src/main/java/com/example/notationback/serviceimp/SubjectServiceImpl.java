package com.example.notationback.serviceimp;

import com.example.notationback.model.Class;
import com.example.notationback.model.Subject;
import com.example.notationback.repository.SubjectRepository;
import com.example.notationback.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    public SubjectRepository subjectRepository;

    @Override
    public List<Subject> getAllSubjects() {
        return (List<Subject>) subjectRepository.findAll();
    }
    @Override
    public Subject createSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public Subject updateSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public Optional<Subject> getSubjectById(Long id) {
        return subjectRepository.findById(id);
    }

    @Override
    public void deleteSubjectById(Long id) {
        subjectRepository.deleteById(id);
    }

    @Override
    public Optional<Subject> findById(Long id) {
        return subjectRepository.findById(id);
    }
}
