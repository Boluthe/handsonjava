package com.bakare.handsjava.controllers;

import com.bakare.handsjava.entities.Teacher;
import com.bakare.handsjava.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping("/{id}")
    public Teacher getTeacherById(@PathVariable Long id) {  // ✅ Correct
        return teacherService.getTeacherById(id);  // ✅ Pass the ID
    }
}


    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }
    @PostMapping
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherService.saveTeacher(teacher);
    }

    @DeleteMapping("/{id}")
    public void deleteTeacher(@PathVariable Long id) {
        teacherService.deleteTeacher();
    }
}