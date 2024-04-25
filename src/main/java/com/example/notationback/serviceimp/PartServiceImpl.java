package com.example.notationback.serviceimp;

import com.example.notationback.model.Part;
import com.example.notationback.model.Student;
import com.example.notationback.repository.PartRepository;
import com.example.notationback.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartServiceImpl implements PartService {
    @Autowired
    public PartRepository partRepository;

    @Override
    public Part createPart(Part part) {
        return partRepository.save(part);
    }

    @Override
    public List<Part> getAllParts() {
        return (List<Part>)  partRepository.findAll();
    }

    @Override
    public List<Part> findByIdExam(Long id) {
        return partRepository.findByIdExam(id);
    }

    @Override
    public Part updatePart(Part part) {
        return partRepository.save(part);
    }

    @Override
    public Optional<Part> getPartById(Long id){
        return partRepository.findById(id);
    }

    @Override
    public void deletePartById(Long id) {
        partRepository.deleteById(id);
    }
}
