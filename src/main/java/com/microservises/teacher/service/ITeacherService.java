package com.microservises.teacher.service;

import com.microservises.teacher.entities.Teacher;

import java.util.List;
import java.util.Optional;

public interface ITeacherService {

    List<Teacher> findAll();
    Teacher findById(Long id);
    void save(Teacher teacher);
    Teacher update(Teacher teacher, Long id);
    void delete(Long id);
}
