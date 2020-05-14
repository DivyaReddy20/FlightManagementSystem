import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Flight, ScheduleFlight } from './scheduleflights/FlightDetails';

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
export class Register {
  userid:number;
  username:string;
  password:string;
  confirmpassword:string;
  mailid:string;
  phnnumber:string;
  
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
export class Flights {
  flightNumber:number;
    flightName:string;
    fromloc:string;
    toloc:string;
    seatCapacity:number;
    costPerSeat:number;
    date1:Date;
    constructor(flightNumber:number,flightName:string,fromloc:string,toloc:string,seatCapacity:number,costPerSeat:number,date1:Date)
     {
      this.flightNumber=flightNumber;
      this.flightName=flightName;
       this.fromloc=fromloc;
       this.toloc=toloc;
       this.seatCapacity=seatCapacity;
       this.costPerSeat=costPerSeat;
      this.date1=date1;
     }
}

@Injectable({
  providedIn: 'root'
})

export class FlightService {

  constructor(private http:HttpClient) { }
  flight:Flight[]=[];
  scheduleFlight:ScheduleFlight[]=[];
  getFlights(){
  return this.http.get("http://localhost:8091/Flights/flightlist");
}
public registerNow(user:Register){
  console.log(user);
  return this.http.post<Register>("http://localhost:8091/Flights/RegPage",user,{responseType:'text' as 'json'});
}
user:addBookingDetails[]=[];
  addBookings(user){
  return this.http.post("http://localhost:8091/Flights/addBooking",user);
}
getUser(bookingId){
  return this.http.delete("http://localhost:8091/Flights/cancelBooking/"+bookingId,{responseType:'text'});
}
showBooking(bookingId){    
  return this.http.get("http://localhost:8091/Flights/get/"+bookingId,{responseType: 'json'});
}
public getSearchFlights(SearchFlight:Flights) {
  console.log(SearchFlight)
      return this.http.get("http://localhost:8092/Flights/SearchFlights/"+SearchFlight.fromloc+"/"+SearchFlight.toloc+"/"+SearchFlight.date1,{responseType: 'json'});
    }
    public AddFlight(flight){
      const headers =new HttpHeaders().set('Content_Type', 'text/plain ;charset=utf-8');
    return this.http.post("http://localhost:8093/flight/AddFlight",flight,  { headers, responseType: 'text'});
  }
  public updateSchedule(scheduleFlight){
 
    const headers=new HttpHeaders().set('Content_Type', 'text/plain ;charset=utf-8');
      return this.http.put("http://localhost:8093/flight/update",scheduleFlight,{ headers, responseType: 'text'});
  }
  
  getscheduleFlight():ScheduleFlight[]{
    return this.scheduleFlight;
  }
  
  getflight():Flight[]{
    return this.flight;
  }
  
  }


