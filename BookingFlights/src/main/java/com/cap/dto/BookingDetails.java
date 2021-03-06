package com.cap.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
//import javax.persistence.OneToOne;
import javax.persistence.Table;
@SuppressWarnings("serial")
@Entity
@Table(name = "bookinglist")
public class BookingDetails implements Serializable{
	@Id
	@GeneratedValue
    private Integer bookingId;
	@Column(length=10)
	private int userId;
	@Column(length=10)
	private int noofSeats;
	@Column(length=10)
	private String passengerName;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "flight_Id")
	private Flight flight;
	
	public Integer getBookingId() {
		return bookingId;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getNoofSeats() {
		return noofSeats;
	}
	public void setNoofSeats(int noofSeats) {
		this.noofSeats = noofSeats;
	}


	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public BookingDetails() {
		super();
	}
	public BookingDetails(Integer bookingId, int userId, int noofSeats, String passengerName) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.noofSeats = noofSeats;
		this.passengerName = passengerName;
	}
	@Override
	public String toString() {
		return "BookingDetails [bookingId=" + bookingId + ", userId=" + userId + ", noofSeats=" + noofSeats
				+ ", passengerName=" + passengerName + ", flight=" + flight + "]";
	}
	
	
	
}
