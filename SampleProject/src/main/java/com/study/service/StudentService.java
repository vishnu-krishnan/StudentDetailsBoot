package com.study.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.repository.StudentRepository;
import com.study.student.Student;

@Service
public class StudentService {
	
	@Autowired
	private final StudentRepository studentRepository;
	
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Student data is not available"));
		
	}
	
	public Student createStudentDetails(Student student) {
		return studentRepository.save(student);
	}
	
	public Student updateStudent(Long id, Student studentDetails) {
		
		Student student = getStudentById(id);
		student.setName(studentDetails.getName());
		student.setSubject(studentDetails.getSubject());
		return studentRepository.save(student);
	}
	
	public void deleteStudent(Long id) {
		Student student = getStudentById(id);
		studentRepository.delete(student);
	}

}
