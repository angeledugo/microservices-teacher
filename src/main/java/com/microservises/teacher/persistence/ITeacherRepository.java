package com.microservises.teacher.persistence;

import com.microservises.teacher.entities.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeacherRepository extends CrudRepository<Teacher, Long> {

}
