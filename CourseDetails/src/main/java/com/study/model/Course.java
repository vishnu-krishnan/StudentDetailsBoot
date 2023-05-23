package com.study.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="course")
@Getter
@Setter
@ToString
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "duration")
	private String duration;
	
	public Course() {
		//default
	}

	public Course(Long id, String name, String duration) {
		super();
		System.out.println("student----- "+id+"  "+name+"  "+duration);
		this.id = id;
		this.name = name;
		this.duration = duration;
	}	
	
	
}
