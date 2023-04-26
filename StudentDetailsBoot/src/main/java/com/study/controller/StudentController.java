package com.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.model.Student;
import com.study.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	public StudentService studentService;
	
	
	@GetMapping("/getall")
	public List<Student> getAllStudentDetails(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/get/{id}")
	public Student getStudentById(Long id) {
		return studentService.getStudentById(id);
	}
	
	@PostMapping("/save")
	public Student saveStudentDetails(Student student) {
		return studentService.saveStudentDetails(student);
	}
	
	@PutMapping("/update/{id}")
	public Student updateStudentDetails(Long id, Student studentDetails) {
		Student student = getStudentById(id);
		student.setName(studentDetails.getName());
		student.setSubject(studentDetails.getSubject());
		return studentService.saveStudentDetails(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteStudentDetails(Long id) {
		studentService.deleteStudentDetails(id);
	}
	

}
