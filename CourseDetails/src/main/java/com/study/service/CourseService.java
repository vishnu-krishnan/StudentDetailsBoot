package com.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study.exception.ResourceNotFoundException;
import com.study.model.Course;
import com.study.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private final CourseRepository courseRepository;

	public CourseService(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	public List<Course> getAllCourses(){
		return courseRepository.findAll();
	}

	public Course getCourseById(Long id) {
		return courseRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Course","id",id));
	}

	@Transactional
	public Course saveCourseDetails(Course courseDetails) {
		return courseRepository.save(courseDetails);
	}

	@Transactional
	public Course updateCourseDetails(Long id, Course courseDetails) {
		try {
			Course details = getCourseById(id);
			if(details.getName()!=null)
				details.setName(courseDetails.getName());

			if(details.getDuration()!=null)
				details.setDuration(courseDetails.getName());

			return courseRepository.save(details);

		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Course","id",id);
		}
	}

	@Transactional
	public void deleteCourseDetails(Long id) {
		try {
			courseRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Course","id",id);
		}
	}
}
