package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Faculty;

@Repository
public interface FacultyDao extends CrudRepository<Faculty, Integer>{

}
