package com.bakare.handsjava.services;

import com.bakare.handsjava.entities.Exam;
import com.bakare.handsjava.repositories.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamService {
        @Autowired
        private ExamRepository examRepository;

        public List<Exam> getAllExams() {
            return examRepository.findAll();
        }

        public Exam getExamById(Long id) {
            return examRepository.findById(id).orElse(null);
        }

        public Exam saveExam(Exam exam) {
            return examRepository.save(exam);
        }

        public void deleteExam(Long id) {
            examRepository.deleteById(id);
        }
}
