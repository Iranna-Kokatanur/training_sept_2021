package com.example.demo.repository;

import java.util.List;

public interface CrudRepository {
	
	public List<String>findAll();
	public List<String>findById();

}
