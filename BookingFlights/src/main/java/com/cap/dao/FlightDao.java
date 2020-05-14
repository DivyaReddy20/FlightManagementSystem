package com.cap.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.dto.Flight;

@Repository
public interface FlightDao extends JpaRepository<Flight, Integer> {

}