package com.cap.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cap.dto.Flight;

@Repository
public interface FlightDao extends JpaRepository<Flight, Integer> {

}