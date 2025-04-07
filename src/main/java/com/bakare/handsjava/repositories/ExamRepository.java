package com.bakare.handsjava.repositories;

import com.bakare.handsjava.entities.Exam;
import com.bakare.handsjava.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam, Long> {
}
