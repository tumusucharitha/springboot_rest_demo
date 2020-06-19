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

import com.example.demo.model.Faculty;
import com.example.demo.service.FacultyService;

@RestController
public class FacultyController 
{
	@Autowired
	private FacultyService facService;
	
	@GetMapping(value = "getFacultys")
	public List<Faculty> getData()
	{		
		return facService.getData();
	}

	@GetMapping(value = "getFaculty/{id}")
	public Faculty getDataById(@PathVariable("id") int id)
	{	
		return facService.getDataById(id);
	}
	
	@PostMapping(value = "saveFaculty")
	public Faculty saveData(@RequestBody Faculty stu1)
	{
		facService.saveData(stu1);
		System.out.println("One record is inserted..");
		return stu1;
	}
	
	@PutMapping( value = "updateFaculty")
	public Faculty updateData(@RequestBody Faculty fac1)
	{
		facService.updateData(fac1);
		return fac1;
	}
	
	@DeleteMapping(value = "deleteFaculty/{id}")
	public String deleteData(@PathVariable int id)
	{
		 facService.deleteData(id);
		 return "Record deleted";
	}
}
