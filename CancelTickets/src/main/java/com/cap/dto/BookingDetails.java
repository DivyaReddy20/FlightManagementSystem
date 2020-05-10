package com.cap.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
	public Integer getBookingId() {
		return bookingId;
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
	
	
	
}
