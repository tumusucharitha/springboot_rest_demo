package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student 
{
	@Id
	@Column(name="stu_id")
	private int stu_id;
	
	@Column(name="stu_name")
	private String stu_name;
	
	@Column(name="age")
	private int age;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="dept_id")
	private int dept_id;
	
	public Student(int stu_id, String stu_name, int age, String gender, int dept_id) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.age = age;
		this.gender = gender;
		this.dept_id = dept_id;
	}
	
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	
	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", stu_name=" + stu_name + ", age=" + age + ", gender=" + gender
				+ ", dept_id=" + dept_id + "]";
	}
		
}
