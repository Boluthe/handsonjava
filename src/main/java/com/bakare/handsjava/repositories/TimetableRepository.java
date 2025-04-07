package com.bakare.handsjava.repositories;

import com.bakare.handsjava.entities.Student;
import com.bakare.handsjava.entities.Timetable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimetableRepository extends JpaRepository<Timetable, Long> {
}
