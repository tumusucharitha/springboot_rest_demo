package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FacultyDao;
import com.example.demo.model.Faculty;

@Service
public class FacultyService {

	@Autowired
	private FacultyDao facDao;
	
	public List<Faculty> getData()
	{
		List<Faculty> listData = new ArrayList<Faculty>();
		facDao.findAll().forEach(listData::add);
		return listData;
	}

	public Faculty getDataById(int id)
	{
		List<Faculty> listData = new ArrayList<Faculty>();
		listData = getData();
		Faculty f1 = new Faculty();
		for(Faculty f2: listData)
		{
			if(id == f2.getFaculty_id())
			{
				f1.setFaculty_id(f2.getFaculty_id());
				f1.setFaculty_name(f2.getFaculty_name());
			}
		}
		System.out.println(f1);
		return f1;
	}
	
	public void saveData(Faculty fac1)
	{
		System.out.println("inside service class of save method..");
		facDao.save(fac1);
	}
	
	public void updateData(Faculty fac1)
	{
		facDao.save(fac1);
		System.out.println("Data is updated..");
	}
	
	public void deleteData(int id)
	{
		facDao.deleteById(id);
	}
}
