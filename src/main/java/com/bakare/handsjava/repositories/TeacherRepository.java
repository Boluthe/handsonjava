package com.bakare.handsjava.repositories;

import com.bakare.handsjava.entities.Student;
import com.bakare.handsjava.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}