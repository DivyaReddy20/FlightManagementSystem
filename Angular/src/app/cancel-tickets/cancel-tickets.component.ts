import { Component, OnInit } from '@angular/core';
import { FlightService, addBookingDetails } from '../flight.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cancel-tickets',
  templateUrl: './cancel-tickets.component.html',
  styleUrls: ['./cancel-tickets.component.css']
})
export class CancelTicketsComponent implements OnInit {
result:string;
bookingId:number;
status:boolean;
msg:string;
user: addBookingDetails = new addBookingDetails(0,0,"",0);
addBookingDetail:addBookingDetails[];
  constructor(private service:FlightService ,private router:Router) { }

  ngOnInit(): void {

  }

  delete(user:addBookingDetails): void {
    this.status=true;
    this.service.getUser(user.bookingId)
      .subscribe( data => {
        alert("cancelled ur booking successfully.");
      },
      err=>{
        console.log("exception occured");
        this.msg="Please enter valid bookingId";
      })

  
  }
}
  
