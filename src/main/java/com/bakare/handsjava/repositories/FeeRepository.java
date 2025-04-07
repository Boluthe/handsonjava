package com.bakare.handsjava.repositories;

import com.bakare.handsjava.entities.Fee;
import com.bakare.handsjava.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeeRepository extends JpaRepository<Fee, Long> {
}
