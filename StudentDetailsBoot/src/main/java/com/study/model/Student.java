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
@Table(name="student")
@Getter
@Setter
@ToString
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "batch")
	private String batch;
	
	public Student() {
		//default
	}

	public Student(Long id, String name, String batch) {
		super();
		System.out.println("student----- "+id+"  "+name+"  "+batch);
		this.id = id;
		this.name = name;
		this.batch = batch;
	}	
	
	
}
