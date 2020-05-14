package com.cap.service;


import java.util.List;

import com.cap.dto.BookingDetails;
import com.cap.dto.Flight;
import com.cap.dto.Register;


public interface BookFlightService {
	public List<Flight> displayFlights();
	public void addBookingDetails(BookingDetails booking);
	public void updateBookingDetails(BookingDetails booking);
	public BookingDetails displayOneBookingList(Integer bookingId);
	public void deleteBookingDetails(Integer bookingId);
	public boolean getBookingData(Integer bookingId);
	 String register(Register reg);
	public Register findOne(String mailid);

}
