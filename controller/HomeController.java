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

import com.example.demo.model.Data;
import com.example.demo.service.StudentService;

@RestController
public class HomeController
{
	@Autowired
	private StudentService stuService;
	
	@GetMapping(value = "getData")
	public List<Data> getData()
	{		
		return stuService.getData();
	}

	@GetMapping(value = "getData/{id}")
	public Data getDataById(@PathVariable("id") int id)
	{	
		return stuService.getDataById(id);
	}
	
	@PostMapping(value = "saveData")
	public Data saveData(@RequestBody Data data1)
	{
		stuService.saveData(data1);
		System.out.println("One record is inserted..");
		return data1;
	}
	
	@PutMapping( value = "updateData")
	public Data updateData(@RequestBody Data data1)
	{
		stuService.updateData(data1);
		return data1;
	}
	
	@DeleteMapping(value = "deleteData")
	public String deleteData(@RequestParam int id)
	{
		 stuService.deleteData(id);
		 return "Record deleted";
	}
}
