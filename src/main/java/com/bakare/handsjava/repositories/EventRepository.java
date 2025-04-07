package com.bakare.handsjava.repositories;

import com.bakare.handsjava.entities.Event;
import com.bakare.handsjava.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
