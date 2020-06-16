package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Data;

@Repository
public interface StudentDao extends CrudRepository<Data, Integer> {

}
