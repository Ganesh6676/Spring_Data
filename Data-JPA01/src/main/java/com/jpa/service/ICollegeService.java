package com.jpa.service;

import java.util.List;

import com.jpa.entity.College;

public interface ICollegeService {
	
	public String insertRecord(College c);
	
	public List<College> getAllRecords();

}
