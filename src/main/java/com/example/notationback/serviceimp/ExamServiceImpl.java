package com.example.notationback.serviceimp;

import com.example.notationback.model.Class;
import com.example.notationback.model.Exam;
import com.example.notationback.repository.ExamRepository;
import com.example.notationback.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExamServiceImpl implements ExamService {
    @Autowired
    public ExamRepository examRepository;

    @Override
    public List<Exam> getAllExams() {
        return (List<Exam>) examRepository.findAll();
    }

    @Override
    public Exam createExam(Exam exam) {
        return examRepository.save(exam);
    }

    @Override
    public Optional<Exam> findById(Long id) {
        return examRepository.findById(id);
    }

    @Override
    public List<Exam> findByIdStudent(Long id) {
        return examRepository.findByIdStudent(id);
    }

    @Override
    public List<Exam> findByIdClass(Long id) {
        return examRepository.findByIdClass(id);
    }

    @Override
    public List<Exam> findByIdSubject(Long id) {
        return examRepository.findByIdSubject(id);
    }

    @Override
    public void deleteById(Long id) {
         examRepository.deleteById(id);
    }


}
