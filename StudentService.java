package com.tutorial.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.model.Student;
import com.tutorial.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired StudentRepository studentRepository;

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> students=new ArrayList<Student>();
		studentRepository.findAll().forEach(student->students.add(student));
		return students;
	}

	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

	public void saveOrUpdate(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
	}

}
