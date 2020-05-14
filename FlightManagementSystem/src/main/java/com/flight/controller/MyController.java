package com.flight.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.entities.FlightData;
import com.flight.service.FlightService;

@RestController
@RequestMapping("/Flights")
@CrossOrigin(origins="http://localhost:4200")
public class MyController {
	@Autowired
	private FlightService flightService;
	
	    
	 //SearchFlights
	@GetMapping("/SearchFlights/{fromloc}/{toloc}/{date1}")
	public ResponseEntity<List<FlightData>> findFlight(@PathVariable String fromloc,@PathVariable String toloc,@PathVariable Date date1){
		List<FlightData> flight= flightService.findFlight(fromloc,toloc,date1);
		
		return new ResponseEntity<List<FlightData>>(flight,HttpStatus.OK);
	    }
}

