package com.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entity.College;

public interface ICollegeRepo extends JpaRepository<College, Long> {

}
