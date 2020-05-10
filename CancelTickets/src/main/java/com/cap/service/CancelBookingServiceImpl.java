package com.cap.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cap.dao.CancelBookingDao;
import com.cap.exceptions.IdNotFoundException;


@Service
@Transactional
public class CancelBookingServiceImpl implements CancelBookingService {
	@Autowired
    private CancelBookingDao dao;
	@Override
	public String deleteBookingDetails(Integer bookingId) throws IdNotFoundException
    {
		boolean result=dao.exists(bookingId);
	
		if(result) {
	        dao.delete(bookingId);
			return "deleted the emp details";
		}
		else 
			throw new IdNotFoundException("id not found");
    }
}
