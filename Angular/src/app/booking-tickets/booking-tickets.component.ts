import { Component, OnInit } from '@angular/core';
import { FlightService, addBookingDetails } from '../flight.service';

@Component({
  selector: 'app-booking-tickets',
  templateUrl: './booking-tickets.component.html',
  styleUrls: ['./booking-tickets.component.css']
})
export class BookingTicketsComponent implements OnInit {
  user: addBookingDetails = new addBookingDetails(0, 0, " ", 0);
  booking: any;
  constructor(private service: FlightService) { }

  ngOnInit(): void {

  }
  bookNow(): void {

    function getRandomInt(max) {
      return Math.floor(Math.random() * Math.floor(max));
    }
    console.log(getRandomInt(100));
    this.service.addBookings(this.user)
      .subscribe(data => {
        this.booking = data
      });
    console.log(this.user);
    alert(" booking successfully done.");
  }
}
