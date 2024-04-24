package com.example.notationback.serviceimp;

import com.example.notationback.model.Student;
import com.example.notationback.repository.StudentRepository;
import com.example.notationback.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudents(){
        return (List<Student>) studentRepository.findAll();
    }


    @Override
    public Optional<Student> getStudentByLastName(String nom) {
        return studentRepository.findByLastName(nom);
    }

    @Override
    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getByIdClass(Long id) {
        return studentRepository.findByIdClass(id);
    }

    @Override
    public List<Student> getStudentByIdClassNull() {
        return studentRepository.findByIdClassIsNull();
    }

}
