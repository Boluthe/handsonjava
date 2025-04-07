package com.bakare.handsjava.services;

import com.bakare.handsjava.entities.Class;
import com.bakare.handsjava.repositories.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {
    @Autowired
    private ClassRepository classRepository;

    public List<Class> getAllClasses() {
        return classRepository.findAll();
    }

    public Class getClassById(Long id) {
        return classRepository.findById(id).orElse(null);
    }

    public Class saveClass(Class classObj) {
        return classRepository.save(classObj);
    }

    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }
}