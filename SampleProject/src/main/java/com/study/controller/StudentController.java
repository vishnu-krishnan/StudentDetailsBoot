package com.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.service.StudentService;
import com.study.student.Student;

@RestController
public class StudentController {

	@Autowired
	public StudentService studentService;



	@GetMapping("/getall")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/get/{id}")
	public Student getStudentById(@PathVariable Long id){
		return studentService.getStudentById(id);
	}

	@PostMapping("/create")
	public Student createStudentDetails (@RequestBody Student student) {
		return studentService.createStudentDetails(student);
	}
	
	@PutMapping("/update/{id}")
	public Student updateStudentDetails(@PathVariable Long id,@RequestBody Student student) {
		return studentService.updateStudent(id, student);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);
	}
	

}
