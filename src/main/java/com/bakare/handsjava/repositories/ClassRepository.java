package com.bakare.handsjava.repositories;

import com.bakare.handsjava.entities.Class;
import com.bakare.handsjava.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<Class, Long> {
}
