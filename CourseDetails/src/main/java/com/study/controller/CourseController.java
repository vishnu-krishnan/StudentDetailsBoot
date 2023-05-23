package com.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.study.model.Course;
import com.study.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	public CourseService courseService;


	@GetMapping("/get")
	public List<Course> getAllCourseDetails(){
		return courseService.getAllCourses();
	}

	@GetMapping("/get/{id}")
	public Course getCourseById(@PathVariable Long id) {
		return courseService.getCourseById(id);
	}

	@PostMapping("/create")
	public Course saveCourseDetails(@RequestBody Course courseDetails) {
		return courseService.saveCourseDetails(courseDetails);
	}

	@PutMapping("/modify/{id}")
	public ResponseEntity<Course> updateCourseDetails(@PathVariable Long id, @RequestBody Course courseDetails) {
		Course details = courseService.updateCourseDetails(id, courseDetails);
		if(details != null) {
			return ResponseEntity.ok(details);
		}else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/delete/{id}")
	public void deleteCourseDetails(@PathVariable Long id) {
		courseService.deleteCourseDetails(id);
	}
}
