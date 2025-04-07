package com.bakare.handsjava.controllers;

import com.bakare.handsjava.entities.Class;
import com.bakare.handsjava.services.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassController {
    @Autowired
    private ClassService classService;

    @GetMapping
    public List<Class> getAllClasses() {
        return classService.getAllClasses();
    }

    @GetMapping("/{id}")
    public Class getClassById(@PathVariable Long id) {
        return classService.getClassById(id);
    }

    @PostMapping
    public Class createClass(@RequestBody Class classObj) {
        return classService.saveClass(classObj);
    }

    @DeleteMapping("/{id}")
    public void deleteClass(@PathVariable Long id) {
        classService.deleteClass(id);
    }
}