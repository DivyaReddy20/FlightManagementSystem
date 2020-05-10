package com.cap.service;


import java.util.List;

import com.cap.dto.BookingDetails;
import com.cap.dto.Flight;


public interface BookFlightService {
	public List<Flight> displayFlights();
	public void addBookingDetails(BookingDetails booking);
	public void updateBookingDetails(BookingDetails booking);
	public BookingDetails displayOneBookingList(Integer bookingId);
	public String updateSeats(Flight flight, BookingDetails book);
}
