package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Faculty")
public class Faculty 
{
	@Id
	@Column(name="faculty_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int faculty_id;
	
	@Column(name="faculty_name")
	private String faculty_name;
	
	public Faculty() {
	}
	public Faculty(int faculty_id, String faculty_name) {
		super();
		this.faculty_id = faculty_id;
		this.faculty_name = faculty_name;
	}
	public int getFaculty_id() {
		return faculty_id;
	}
	public void setFaculty_id(int faculty_id) {
		this.faculty_id = faculty_id;
	}
	public String getFaculty_name() {
		return faculty_name;
	}
	public void setFaculty_name(String faculty_name) {
		this.faculty_name = faculty_name;
	}
	@Override
	public String toString() {
		return "Faculty [faculty_id=" + faculty_id + ", faculty_name=" + faculty_name + "]";
	}	
}
