import { Component, OnInit } from '@angular/core';
import { FlightService, addBookingDetails, Booking } from '../flight.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-book-flight',
  templateUrl: './book-flight.component.html',
  styleUrls: ['./book-flight.component.css']
})
export class BookFlightComponent implements OnInit {
  flights:any=[];
  from_loc:string;
  constructor(private service:FlightService,private router:Router) { }

  ngOnInit(): void {
    let resp=this.service.getFlights();
    resp.subscribe((data)=>this.flights=data);
  }
  bookings(){
  this.router.navigate(['add-booking']);
  }
  
}
  