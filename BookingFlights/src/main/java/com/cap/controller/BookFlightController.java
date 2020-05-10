package com.cap.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.dto.BookingDetails;
import com.cap.dto.Flight;
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
		flightService.addBookingDetails(booking);
		return flightService.displayOneBookingList(booking.getBookingId());
	
	}

	@GetMapping("/get/{bookingId}")
	public BookingDetails displayOneList(@PathVariable Integer bookingId) {
		return flightService.displayOneBookingList(bookingId);
	}

	@PutMapping(value = "/update/{bookingId}")
	public String updateBookingDetails(@RequestBody() BookingDetails booking) {
		flightService.updateBookingDetails(booking);
		return "Booking Details updated with new Booking Id ";
	}

}
