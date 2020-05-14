package com.capgemini.entity;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="add_Flights")
public class Flight implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int flights;
	@Column(length=10)
	private String carrierName;
	@Column(length=10)
	private String flightModel;
	private int seatCapacity;
	
	 @OneToOne(cascade = {CascadeType.ALL})
	    @JoinColumn(name = "flight_number")
	 @JsonProperty()
	 @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private ScheduleFlight scheduleFlight;
	
	public int getFlightNumber() {
		return flights;
	}
	public void setFlights(int flights) {
        this.flights = flights;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	public String getFlightModel() {
		return flightModel;
	}
	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
	   this.seatCapacity = seatCapacity;
	}
	
	
	public ScheduleFlight getScheduleFlight() {
		return scheduleFlight;
	}
	public void setScheduleFlight(ScheduleFlight scheduleFlight) {
		this.scheduleFlight = scheduleFlight;
	}
	
	public Flight(int flights, String carrierName, String flightModel, int seatCapacity,
			ScheduleFlight scheduleFlight) {
		super();
		this.flights = flights;
		this.carrierName = carrierName;
		this.flightModel = flightModel;
		this.seatCapacity = seatCapacity;
		this.scheduleFlight = scheduleFlight;
        this.scheduleFlight.setFlight(this);
	}
	public Flight(){
		
	}
	
	
}
