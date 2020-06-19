package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student 
{
	@Id
	@Column(name="stu_id") 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stu_id;
	
	@Column(name="stu_name")
	private String stu_name;
	
	@Column(name="age")
	private int age;
	
	@Column(name="gender")
	private String gender;
	
	@OneToOne
	@JoinColumn(name="dept_id")
	private Department dept;
	
	public Student() {
	}
	public Student(int stu_id, String stu_name, int age, String gender, Department dept) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
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
	
	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", stu_name=" + stu_name + ", age=" + age + ", gender=" + gender
				+ ", dept_id=" + dept + "]";
	}
		
}
