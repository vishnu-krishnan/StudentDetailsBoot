package com.study.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study.exception.ResourceNotFoundException;
import com.study.model.Student;
import com.study.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private final StudentRepository studentRepository;

	public StudentService (StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}

	public Student getStudentById(Long id) {
		return studentRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Student","id",id));
	}

	@Transactional
	public Student saveStudentDetails(Student student) {
		return studentRepository.save(student);
	}

	@Transactional
	public Student updateStudentDetails(Long id, Student studentDetails) {
		try {
			Student student = getStudentById(id);
			if(studentDetails.getName()!=null)
				student.setName(studentDetails.getName());

			if(studentDetails.getBatch()!=null)
				student.setBatch(studentDetails.getBatch());

			return studentRepository.save(student);

		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Student","id",id);
		}
	}

	@Transactional
	public void deleteStudentDetails(Long id) {
		try {
			studentRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Student","id",id);
		}
	}
}
