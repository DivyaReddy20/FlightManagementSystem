package com.cap.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Flightsdata")
public class Flight implements Serializable {
	@Id
    @GeneratedValue
	private Integer scheduledflightId;
	private int flightNumber;
	@Column(length=10)
	private String carrierName;
	@Column(length=10)
	private String flightModel;
	@Column(length=10)
	private int seatCapacity;
	@Column(length=10)
	private String from_loc;
	@Column(length=10)
	private String to_loc;
	@Column(length=10)
	private Date date1;
	@Column(length=10)
	private int ticketCostPerSeat;

	public Integer getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(Integer flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public Integer getScheduledFlightId() {
		return scheduledflightId;
	}


	public void setScheduledFlightId(Integer scheduledflightId) {
		this.scheduledflightId = scheduledflightId;
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

	

	public Integer getScheduledflightId() {
		return scheduledflightId;
	}

	public void setScheduledflightId(Integer scheduledflightId) {
		this.scheduledflightId = scheduledflightId;
	}

	

	

	public String getFrom_loc() {
		return from_loc;
	}

	public void setFrom_loc(String from_loc) {
		this.from_loc = from_loc;
	}

	public String getTo_loc() {
		return to_loc;
	}

	public void setTo_loc(String to_loc) {
		this.to_loc = to_loc;
	}

	public int getTicketCostPerSeat() {
		return ticketCostPerSeat;
	}

	public void setTicketCostPerSeat(int ticketCostPerSeat) {
		this.ticketCostPerSeat = ticketCostPerSeat;
	}

	public Date getDate1() {
		return date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	
	public Flight(Integer scheduledflightId, Integer flightNumber, String carrierName, String flightModel,
			int seatCapacity, String from_loc, String to_loc, Date date1, int ticketCostPerSeat) {
		super();
		this.scheduledflightId = scheduledflightId;
		this.flightNumber = flightNumber;
		this.carrierName = carrierName;
		this.flightModel = flightModel;
		this.seatCapacity = seatCapacity;
		this.from_loc = from_loc;
		this.to_loc = to_loc;
		this.date1 = date1;
		this.ticketCostPerSeat = ticketCostPerSeat;
	}

	public Flight() {
		
	}


	@Override
	public String toString() {
		return "Flight [scheduledflightId=" + scheduledflightId + ", flightNumber=" + flightNumber + ", carrierName="
				+ carrierName + ", flightModel=" + flightModel + ", seatCapacity=" + seatCapacity + ", from_loc="
				+ from_loc + ", to_loc=" + to_loc + ", date1=" + date1 + ", ticketCostPerSeat=" + ticketCostPerSeat
				+ "]";
	}


}
