package com.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.study.model.Student;
import com.study.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {

	@Autowired
	public StudentService studentService;


	@GetMapping("/get")
	public List<Student> getAllStudentDetails(){
		return studentService.getAllStudents();
	}

	@GetMapping("/get/{id}")
	public Student getStudentById(@PathVariable Long id) {
		return studentService.getStudentById(id);
	}

	@PostMapping("/create")
	public Student saveStudentDetails(@RequestBody Student student) {
		return studentService.saveStudentDetails(student);
	}

	@PutMapping("/modify/{id}")
	public ResponseEntity<Student> updateStudentDetails(@PathVariable Long id, @RequestBody Student studentDetails) {
		Student student = studentService.updateStudentDetails(id, studentDetails);
		if(student != null) {
			return ResponseEntity.ok(student);
		}else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/delete/{id}")
	public void deleteStudentDetails(@PathVariable Long id) {
		studentService.deleteStudentDetails(id);
	}
}
