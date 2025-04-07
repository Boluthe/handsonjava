package com.bakare.handsjava.repositories;

import com.bakare.handsjava.entities.Student;
import com.bakare.handsjava.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
