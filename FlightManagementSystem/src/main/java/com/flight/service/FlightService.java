package com.flight.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.dao.FlightDao;
import com.flight.entities.FlightData;



@Service
public class FlightService implements FlightServiceImpl{


	  @Autowired
		private FlightDao flightDao;

	@Override
		public List<FlightData> findFlight(String fromloc,String toloc, Date date1){
			return  flightDao.findFlight(fromloc,toloc,date1);
		}
}