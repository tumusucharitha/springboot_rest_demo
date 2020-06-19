package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DepatmentDao;
import com.example.demo.model.Data;
import com.example.demo.model.Department;

@Service
public class DeptService 
{
	@Autowired
	private DepatmentDao deptDao;
	
	public List<Department> getData()
	{
		List<Department> listData = new ArrayList<Department>();
		deptDao.findAll().forEach(listData::add);
		return listData;
	}

	public Department getDataById(int id)
	{
		List<Department> listData = new ArrayList<Department>();
		listData = getData();
		Department d1 = new Department();
		for(Department d2: listData)
		{
			if(id == d2.getDept_id())
			{
				d1.setDept_id(d2.getDept_id());
				d1.setDept_name(d2.getDept_name());
			}
		}
		return d1;
	}
	
	public void saveData(Department dept1)
	{
		System.out.println("inside service class of save method..");
		deptDao.save(dept1);
	}
	
	public void updateData(Department dept1)
	{
		deptDao.save(dept1);
		System.out.println("Data is updated..");
	}
	
	public void deleteDept(int id)
	{
		deptDao.deleteById(id);
	}
	
}
