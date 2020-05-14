package com.flight.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="searchflights")
public class FlightData {
@Id
@GeneratedValue
@Column(length=10)
private int flightNumber;
@Column(length=10)
private String flightName;
@Column(length=10)
private String fromloc;
@Column(length=10)
private String toloc;
@Column(length=10)
private int seatCapacity;
@Column(length=10)
private int costPerSeat;
@Column(length=10)
private Date date1;
public int getFlightNumber() {
	return flightNumber;
}
public void setFlightNumber(int flightNumber) {
	this.flightNumber = flightNumber;
}
public String getFlightName() {
	return flightName;
}
public void setFlightName(String flightName) {
	this.flightName = flightName;
}

public Date getDate1() {
	return date1;
}
public void setDate1(Date date1) {
	this.date1 = date1;
}
public String getFromloc() {
	return fromloc;
}
public void setFromloc(String fromloc) {
	this.fromloc = fromloc;
}
public String getToloc() {
	return toloc;
}
public void setToloc(String toloc) {
	this.toloc = toloc;
}
public int getSeatCapacity() {
	return seatCapacity;
}
public void setSeatCapacity(int seatCapacity) {
	this.seatCapacity = seatCapacity;
}
public int getCostPerSeat() {
	return costPerSeat;
}
public void setCostPerSeat(int costPerSeat) {
	this.costPerSeat = costPerSeat;
}


public FlightData(int flightNumber, String flightName, String fromloc, String toloc, int seatCapacity, int costPerSeat,
		Date date1) {
	super();
	this.flightNumber = flightNumber;
	this.flightName = flightName;
	this.fromloc = fromloc;
	this.toloc = toloc;
	this.seatCapacity = seatCapacity;
	this.costPerSeat = costPerSeat;
	this.date1 = date1;
}

@Override
public String toString() {
	return "Flight [flightNumber=" + flightNumber + ", flightName=" + flightName + ", fromloc=" + fromloc + ", toloc="
			+ toloc + ", seatCapacity=" + seatCapacity + ", costPerSeat=" + costPerSeat + ", date1=" + date1 + "]";
}
public FlightData()  {
	super();
}

}

