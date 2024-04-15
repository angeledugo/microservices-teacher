package com.microservises.teacher.controller;

import com.microservises.teacher.entities.Teacher;
import com.microservises.teacher.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/teacher")
public class TeacherController {
    @Autowired
    private ITeacherService teacherService;

    @GetMapping("/all")
    public ResponseEntity<?> listTeacher() {
        return ResponseEntity.ok(teacherService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(teacherService.findById(id));
    }

    @GetMapping("/search-my-teacher/{id}")
    public ResponseEntity<?> searchMyTeacher(@PathVariable("id") Long id) {
        return ResponseEntity.ok(teacherService.findById(id));
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveTeacher(@RequestBody Teacher teacher) {
        teacherService.save(teacher);
    }


    @PutMapping("/{id}")
    public Teacher update(@PathVariable Long id,@RequestBody Teacher teacher) {
        return teacherService.update(teacher, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        Teacher existingTeacher = this.teacherService.findById(id);

        teacherService.delete(existingTeacher.getId());

    }
}
