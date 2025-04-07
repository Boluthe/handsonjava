package com.bakare.handsjava.services;

import com.bakare.handsjava.entities.Attendance;
import com.bakare.handsjava.entities.Student;
import com.bakare.handsjava.repositories.AttendanceRepository;
import com.bakare.handsjava.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceService {
    @Autowired
    private AttendanceRepository attendanceRepository;

    public List<Attendance> getAllAttendance() {
        return attendanceRepository.findAll();
    }

    public Attendance getAttendanceById(Long id) {
        return attendanceRepository.findById(id).orElse(null);
    }

    public Attendance saveAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    public void deleteAttendance(Long id) {
        attendanceRepository.deleteById(id);
    }
}
