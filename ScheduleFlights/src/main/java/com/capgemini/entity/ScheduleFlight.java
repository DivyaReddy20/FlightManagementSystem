package com.capgemini.entity;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="scheduled_flights")
public class ScheduleFlight {
	
	@Id
	@Column(name="flight_number")
	private int flightNumber;
	@Column(length=10)
	private int scheduleFlightId; 
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "scheduleFlight")
	private Flight flight;
	

	 @OneToOne(cascade = {CascadeType.ALL})
	    @JoinColumn(name = "scheduleId")
	 @JsonProperty()
	 @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	 private Schedule schedule;
	 
	 
	
	public int getScheduleFlightId() {
		return scheduleFlightId;
	}



	public void setScheduleFlightId(int scheduleFlightId) {
		this.scheduleFlightId = scheduleFlightId;
	}



	

	public Flight getFlight() {
		return flight;
	}



	public void setFlight(Flight flight) {
		this.flight = flight;
	}



	public Schedule getSchedule() {
		return schedule;
	}



	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public int getFlightNumber() {
		return flightNumber;
	}



	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}



	public ScheduleFlight(int scheduleFlightId, int flightNumber, Flight flight, Schedule schedule) {
		super();
		this.scheduleFlightId = scheduleFlightId;
		this.flightNumber = flightNumber;
		this.flight = flight;
		this.schedule = schedule;
		this.schedule.setScheduleFlight(this);
	}



	public ScheduleFlight(){
		
	}

	
}
