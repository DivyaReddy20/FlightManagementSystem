package com.capgemini.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="airportDet")
public class Airport {

	@Id
	private int airportId;
	@Column(length=30)
	private String airportName;
	@Column(length=30)
    private String airportLocation;
	@Column(length=30)
	private String airportCode;
    
    public int getAirportId() {
		return airportId;
	}
	public void setAirportId(int airportId) {
		this.airportId = airportId;
	}
	@OneToOne(mappedBy = "airport")
    private Schedule schedule;
    
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getAirportLocation() {
		return airportLocation;
	}
	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}
	public String getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public Airport(int airportId,String airportName, String airportLocation, String airportCode) {
		super();
		this.airportId = airportId;
		this.airportName = airportName;
		this.airportLocation = airportLocation;
		this.airportCode = airportCode;
	}
    public Airport(){
    	
    }
}
