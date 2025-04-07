package com.bakare.handsjava.repositories;

import com.bakare.handsjava.entities.Attendance;
import com.bakare.handsjava.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
}
