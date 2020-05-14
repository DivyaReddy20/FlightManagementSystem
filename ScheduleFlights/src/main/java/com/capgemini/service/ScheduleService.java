package com.capgemini.service;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.dao.FlightDao;
import com.capgemini.dao.ScheduleDao;
import com.capgemini.entity.Flight;
import com.capgemini.entity.ScheduleFlight;


@Service
public class ScheduleService implements ScheduleServiceI{

	@Autowired
	private ScheduleDao scheduledao ;
	
	@Autowired
	private FlightDao flightdao ;
    ScheduleFlight scheduleFlight;
	
	
@Override
public String addFlight(Flight flight) {
	
	 flightdao.save(flight);
	 return "Flight is Added";
	
}

	
       @Override
		public ScheduleFlight updateFlight(ScheduleFlight schedule) {
		
		boolean result=scheduledao.existsById(schedule.getFlightNumber());
		ScheduleFlight data = null;
		if(result){
			 data=scheduledao.save(schedule);
		}
			return data;

	
	}

	
	
}
