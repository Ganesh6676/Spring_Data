package com.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="COLLEGE")
@Data
public class College {
	
	@Id
	@GeneratedValue(generator="COL_SEQ",strategy=GenerationType.AUTO)
	private Long cid;
	private String cname;
	private String caddrs;
	private Long cphno;

}
