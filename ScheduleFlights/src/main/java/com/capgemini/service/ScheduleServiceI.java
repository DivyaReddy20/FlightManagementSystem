package com.capgemini.service;


import java.time.LocalDateTime;
import java.util.List;

import com.capgemini.entity.Flight;
import com.capgemini.entity.ScheduleFlight;


public interface ScheduleServiceI {

	ScheduleFlight updateFlight(ScheduleFlight schedule);

	String addFlight(Flight flight);
	 
}
