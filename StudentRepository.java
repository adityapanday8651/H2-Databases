package com.tutorial.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student,Integer>{

}
