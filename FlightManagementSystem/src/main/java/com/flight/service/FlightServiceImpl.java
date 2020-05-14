package com.flight.service;

import java.sql.Date;
import java.util.List;

import com.flight.entities.FlightData;



public interface FlightServiceImpl {
	
	
	 
	 List<FlightData> findFlight(String fromloc, String toloc, Date date1);


}