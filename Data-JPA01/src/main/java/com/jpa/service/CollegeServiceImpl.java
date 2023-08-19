package com.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.entity.College;
import com.jpa.repo.ICollegeRepo;

@Service
public class CollegeServiceImpl implements ICollegeService {

	@Autowired
	private ICollegeRepo repo;
	
	@Override
	public String insertRecord(College c) {
		System.out.println("CollegeServiceImpl.insertRecord()");
		return repo.save(c)!=null?"Record is inserted successfully...":
			"Record insertion is failed....";
	}

	@Override
	public List<College> getAllRecords() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
