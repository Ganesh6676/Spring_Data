package com.jpa;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.entity.College;
import com.jpa.service.CollegeServiceImpl;

@SpringBootApplication
public class DataJpa01Application {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(DataJpa01Application.class, args);
	
		CollegeServiceImpl cs = con.getBean("collegeServiceImpl",CollegeServiceImpl.class);
		
//			College col = new College();
//			col.setCname("Loyola");
//			col.setCaddrs("Vijayawada");
//			col.setCphno(986452525L);
//			
//			String msg = cs.insertRecord(col);
//			
//	        System.out.println(msg);
			
		List<College> lc = cs.getAllRecords();
		
		lc.forEach(col->{
			System.out.println(col);
		});
	
	}

}
