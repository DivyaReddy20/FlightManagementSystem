package com.capgemini.dao;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.entity.Flight;
import com.capgemini.entity.ScheduleFlight;


@Repository
public interface ScheduleDao extends JpaRepository<ScheduleFlight,Integer> {
	
}
