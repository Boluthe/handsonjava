package com.bakare.handsjava.repositories;

import com.bakare.handsjava.entities.Library;
import com.bakare.handsjava.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Long> {
}