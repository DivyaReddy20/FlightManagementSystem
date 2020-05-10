package com.cap.service;


import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.BookFlightDao;
import com.cap.dao.FlightDao;
import com.cap.dto.BookingDetails;
import com.cap.dto.Flight;
import com.cap.exceptions.IdNotFoundException;

@Service
@Transactional
public class BookFlightServiceImpl implements BookFlightService{
	@Autowired
    private BookFlightDao bookingdao;
	@Autowired
    private FlightDao dao;
	
	public FlightDao getDao(){
        return dao;
    }
	@Override
	public List<Flight> displayFlights() {
		List<Flight> flights= dao.findAll();
		return flights;
		
	}
	
	@Override
	 public void addBookingDetails(BookingDetails booking)
	    {

	      bookingdao.save(booking);
	    }

    @Override
     public void updateBookingDetails(BookingDetails booking)
   {
	 bookingdao.delete(booking);
     bookingdao.save(booking);
	}

	@Override
	public BookingDetails displayOneBookingList(Integer bookingId) {
		BookingDetails list= bookingdao.findOne(bookingId);
		return list;
	}
	@Override
	public String updateSeats(Flight flight,BookingDetails book) {
        
			dao.save(flight);
			return "seats were updated successfully!!";
	
	}
}
