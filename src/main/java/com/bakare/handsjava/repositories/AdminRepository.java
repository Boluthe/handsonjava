package com.bakare.handsjava.repositories;

import com.bakare.handsjava.entities.Admin;
import com.bakare.handsjava.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}