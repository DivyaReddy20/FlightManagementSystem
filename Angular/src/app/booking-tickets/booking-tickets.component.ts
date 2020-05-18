import { Component, OnInit } from '@angular/core';
import { FlightService, addBookingDetails, Booking, Flightlist } from '../flight.service';
import { ThrowStmt } from '@angular/compiler';

@Component({
  selector: 'app-booking-tickets',
  templateUrl: './booking-tickets.component.html',
  styleUrls: ['./booking-tickets.component.css']
})
export class BookingTicketsComponent implements OnInit {
  user: addBookingDetails = new addBookingDetails(0, 0, " ", 0);
  view: Flightlist = new Flightlist(0, 0, "", 0, "");
  booking: Booking=new Booking(0,0,"","",0,"","","",0);
  bookings: any;
  check: boolean = false;
  check1: boolean = true;

  flights: any = [];
  scheduledflightId: number;
  flightNumber: number;
  carrierName: string;
  flightModel: string;
  seatCapacity: number;
  from_loc: string;
  to_loc: string;
  date1: string;
  ticketCostPerSeat: number

  constructor(private service: FlightService) { }


  ngOnInit(): void {
    let resp = this.service.getFlights();
    resp.subscribe((data) => this.flights = data);
  }
  list(flight: Booking) {
    console.log(flight)
    this.scheduledflightId=flight.scheduledflightId;
    this.flightNumber = flight.flightNumber;
    this.carrierName = flight.carrierName;
    this.flightModel = flight.flightModel;
    this.seatCapacity = flight.seatCapacity;
    this.from_loc = flight.from_loc;
    this.to_loc = flight.to_loc;
    this.date1 = flight.date1;
    this.ticketCostPerSeat = flight.ticketCostPerSeat

    this.view.flight = flight;

  }





  bookNow(): void {
    console.log(this.view.flight);
    this.view.userId = this.user.userId
    this.view.bookingId = this.user.bookingId
    this.view.passengerName = this.user.passengerName
    this.view.noofSeats = this.user.noofSeats
    this.service.addBookings(this.view)
      .subscribe((data) => this.bookings=data);
    this.check = true;
    this.check1 = false;

    alert(" booking successfully done.");
  }
}
