package com.microservises.teacher.service;

import com.microservises.teacher.entities.Teacher;
import com.microservises.teacher.persistence.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements ITeacherService {

    @Autowired
    private ITeacherRepository teacherRepository;

    @Override
    public List<Teacher> findAll() {
        return (List<Teacher>) teacherRepository.findAll();
    }

    @Override
    public Teacher findById(Long id) {
        return teacherRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public Teacher update(Teacher teacher, Long id) {
        Teacher updateTeacher = teacherRepository.findById(id).orElse(new Teacher());
        updateTeacher.setName(teacher.getName());
        return teacherRepository.save(updateTeacher);
    }

    @Override
    public void delete(Long id) {
        teacherRepository.deleteById(id);
    }
}
