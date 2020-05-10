package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cap.service.CancelBookingService;

@RestController
@RequestMapping("/Flights")
@CrossOrigin("http://localhost:4200")
public class CancelBookingController  {
	@Autowired
    CancelBookingService service;

	@DeleteMapping("/cancelBooking/{bookingId}")
	  public String deleteBookingDetails(@PathVariable Integer bookingId)
	  {
	 	
	 	return service.deleteBookingDetails(bookingId);
	  }
}
