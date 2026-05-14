package com.bakare.handsjava.services;

import com.bakare.handsjava.entities.Teacher;
import com.bakare.handsjava.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    // Fixed: Added `teacherId` parameter
    public Teacher getTeacherById(Long teacherId) {
        return teacherRepository.findById(teacherId).orElse(null);
    }

    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    // Fixed: Added update logic (currently just fetches, needs implementation)
    public Teacher updateTeacher(Long id, Teacher teacher) {
        Teacher existingTeacher = teacherRepository.findById(id).orElse(null);
        if (existingTeacher != null) {
            existingTeacher.setFirstName(teacher.getFirstName());
            existingTeacher.setLastName(teacher.getLastName());
            existingTeacher.setEmail(teacher.getEmail());
            existingTeacher.setPhoneNumber(teacher.getPhoneNumber());
            existingTeacher.setAddress(teacher.getAddress());
            existingTeacher.setGender(teacher.getGender());
            existingTeacher.setSubjectTaught(teacher.getSubjectTaught());
            existingTeacher.setQualification(teacher.getQualification());
            existingTeacher.setHireDate(teacher.getHireDate());
            return teacherRepository.save(existingTeacher);
        }
        return null;
    }

    // Fixed: Added `id` parameter
    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }
}
