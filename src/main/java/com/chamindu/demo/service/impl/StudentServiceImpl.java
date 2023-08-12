package com.chamindu.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chamindu.demo.entity.Student;
import com.chamindu.demo.repository.StudentRepository;
import com.chamindu.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}
}
