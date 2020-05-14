package com.cap.service;


import java.sql.Date;
import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.BookFlightDao;
import com.cap.dao.FlightDao;
import com.cap.dao.RegisterDao;
import com.cap.dto.BookingDetails;
import com.cap.dto.Flight;
import com.cap.dto.Register;


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
	public void deleteBookingDetails(Integer bookingId)
    {
	     bookingdao.delete(bookingId);
    }
	
	@Override
	public boolean getBookingData(Integer bookingId) {
		return bookingdao.exists(bookingId);
	}
	
	@Autowired
	private RegisterDao registerDao;
	
	@Override
	public String register(Register reg) {
		registerDao.save(reg);
	return "registered successfully";
	}

	  public Register findOne(String reg) {
		return registerDao.findByMailid(reg);
	}
	  
	  
}
