package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.service.DeptService;

@RestController
public class DepartmentCtrl {

	@Autowired
	private DeptService deptService;
	
	@GetMapping(value = "getDepartments")
	public List<Department> getData()
	{		
		return deptService.getData();
	}

	@GetMapping(value = "getDepartment/{id}")
	public Department getDataById(@PathVariable("id") int id)
	{	
		return deptService.getDataById(id);
	}
	
	@PostMapping(value = "saveDepartment")
	public Department saveData(@RequestBody Department stu1)
	{
		deptService.saveData(stu1);
		System.out.println("One record is inserted..");
		return stu1;
	}
	
	@PutMapping( value = "updateDepartment")
	public Department updateData(@RequestBody Department stu1)
	{
		deptService.updateData(stu1);
		return stu1;
	}
	
	@DeleteMapping(value = "deleteDepartment/{id}")
	public String deleteData(@PathVariable int id)
	{
		 deptService.deleteDept(id);
		 return "Record deleted";
	}
}
