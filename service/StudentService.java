package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;

@Service
public class StudentService 
{	
	@Autowired
	private StudentDao stuDao;
	
	public List<Student> getData()
	{
		List<Student> listData = new ArrayList<Student>();
		stuDao.findAll().forEach(listData::add);
		return listData;
	}

	public Student getDataById(int id)
	{
		List<Student> listData = new ArrayList<Student>();
		listData = getData();
		Student s1 = new Student();
		for(Student s2: listData)
		{
			if(id == s2.getStu_id())
			{
				s1.setStu_id(s2.getStu_id());
				s1.setStu_name(s2.getStu_name());
				s1.setAge(s2.getAge());
				s1.setGender(s2.getGender());
			}
		}
		return s1;
	}
	
	public void saveData(Student stu1)
	{
		System.out.println("inside service class of save method..");
		stuDao.save(stu1);
	}
	
	public void updateData(Student stu1)
	{
		stuDao.save(stu1);
		System.out.println("Data is updated..");
	}
	
	public void deleteData(int id)
	{
		stuDao.deleteById(id);
	}
}