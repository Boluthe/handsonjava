package com.bakare.handsjava.services;

import com.bakare.handsjava.entities.Class;
import com.bakare.handsjava.entities.Subject;
import com.bakare.handsjava.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
        @Autowired
        private SubjectRepository subjectRepository;

        public List<Subject> getAllSubjects() {
            return subjectRepository.findAll();
        }

        public Subject getSubjectById(Long id) {
            return subjectRepository.findById(id).orElse(null);
        }

        public Subject saveSubject(Subject subjectObj) {
            return subjectRepository.save(subjectObj);
        }

        public void deleteClass(Long id) {
            subjectRepository.deleteById(id);
        }

    public void deleteSubject(Long id) {
    }

}
