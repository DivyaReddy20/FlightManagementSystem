package com.cap.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.dto.BookingDetails;
import com.cap.dto.Flight;
import com.cap.dto.Register;
import com.cap.exceptions.IdNotFoundException;
import com.cap.service.BookFlightService;


@RestController
@RequestMapping("/Flights")
@CrossOrigin("http://localhost:4200")
public class BookFlightController {

	@Autowired
	BookFlightService flightService;

	@GetMapping("/flightlist")
	public List<Flight> displayFlights() {
		return flightService.displayFlights();
	}


	@PostMapping(value = "/addBooking")
	public BookingDetails addBookingDetails(@RequestBody() BookingDetails booking) {
		System.out.println(booking);
		flightService.addBookingDetails(booking);
		System.out.println(booking.getUserId());
		System.out.println(flightService.displayOneBookingList(booking.getUserId()));
		return flightService.displayOneBookingList(booking.getUserId());
	
	}

	@GetMapping("/get/{bookingId}")
	public BookingDetails displayOneList(@PathVariable Integer bookingId) {	
		 Boolean booking=flightService.getBookingData(bookingId);
			if(Boolean.TRUE.equals(booking))
			{
			return flightService.displayOneBookingList(bookingId);
			}
			else
				throw new IdNotFoundException("BookingId is not found");
			}


	@PutMapping(value = "/update/{bookingId}")
	public String updateBookingDetails(@RequestBody() BookingDetails booking) {
		flightService.updateBookingDetails(booking);
		return "Booking Details updated with new Booking Id ";
	}
	
	@DeleteMapping("/cancelBooking/{bookingId}")
	  public ResponseEntity<Boolean>  deleteBookingDetails(@PathVariable Integer bookingId) {
	  Boolean booking=flightService.getBookingData(bookingId);
	if(Boolean.TRUE.equals(booking))
	{
	flightService.deleteBookingDetails(bookingId);
	return new ResponseEntity<>(true, new HttpHeaders(), HttpStatus.OK);
	}
	else
		throw new IdNotFoundException("BookingId is not found");
	}
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<String> bookingIdNotFound(IdNotFoundException e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	
	@PostMapping("/RegPage")
	public String register(@RequestBody Register reg){
		Register user1 = flightService.findOne(reg.getMailid());
		 if (user1!=null)
		    {
			 return "User exists with same MailId!!";
		    }
		    else {

		    	return flightService.register(reg);

		    }
	}
	
	
	

}
