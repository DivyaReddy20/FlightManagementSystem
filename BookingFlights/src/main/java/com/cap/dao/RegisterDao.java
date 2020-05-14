package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.dto.Register;



@Repository
public interface RegisterDao extends JpaRepository<Register, Integer> {

	public Register findByMailid(String reg);
	}

