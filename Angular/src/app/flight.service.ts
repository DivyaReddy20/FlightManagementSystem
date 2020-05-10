import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
export class Booking{
  flightNumber:number;
  carrierName:string;
  flightModel:string;
  seatCapacity:number;
  from_loc:string;
  to_loc:string;
  date1:Date
  ticketCostPerSeat:number

  constructor(flightNumber:number,carrierName:string,flightModel:string,seatCapacity:number,
    from_loc:string,to_loc:string,date1:Date,ticketCostPerSeat:number){
    this.flightNumber=flightNumber;
    this.carrierName=carrierName;
    this.flightModel=flightModel;
    this.seatCapacity=seatCapacity;
    this.from_loc=from_loc;
    this.to_loc=to_loc;
    this.ticketCostPerSeat=ticketCostPerSeat;
  }
}
export class addBookingDetails{
  userId:number;
  bookingId:number;
  passengerName:string;
  noofSeats:number;

  constructor( userId:number,bookingId:number,
    passengerName:string,
    noofSeats:number){
    this.userId=userId;
    this.bookingId=bookingId;
    this.noofSeats=noofSeats;
    this.passengerName=passengerName;
  }
}

@Injectable({
  providedIn: 'root'
})

export class FlightService {

  constructor(private http:HttpClient) { }
  getFlights(){
  return this.http.get("http://localhost:8091/Flights/flightlist");
}
user:addBookingDetails[]=[];
  addBookings(user){
  return this.http.post("http://localhost:8091/Flights/addBooking",user);
}
getUser(bookingId){
  return this.http.delete("http://localhost:8092/Flights/cancelBooking/"+bookingId,{responseType:'text'});
}
showBooking(bookingId){    
  return this.http.get("http://localhost:8091/Flights/get/"+bookingId,{responseType: 'json'});
}
}

