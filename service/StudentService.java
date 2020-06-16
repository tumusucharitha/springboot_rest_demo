package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Data;

@Service
public class StudentService 
{	
	@Autowired
	private StudentDao stuDao;
	
	public List<Data> getData()
	{
		List<Data> listData = new ArrayList<Data>();
		stuDao.findAll().forEach(listData::add);
		return listData;
	}

	public Data getDataById(int id)
	{
		List<Data> listData = new ArrayList<Data>();
		listData = getData();
		Data d1 = new Data();
		for(Data d2: listData)
		{
			if(id == d2.getId())
			{
				d1.setId(d2.getId());
				d1.setName(d2.getName());
				d1.setAddress(d2.getAddress());
			}
		}
		return d1;
	}
	
	public void saveData(Data data1)
	{
		System.out.println("inside service class of save method..");
		stuDao.save(data1);
	}
	
	public void updateData(Data data1)
	{
		stuDao.save(data1);
		System.out.println("Data is updated..");
	}
	
	public void deleteData(int id)
	{
		stuDao.deleteById(id);
	}
}