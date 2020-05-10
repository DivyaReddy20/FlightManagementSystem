import { Component, OnInit } from '@angular/core';
import { addBookingDetails, FlightService } from '../flight.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-booking',
  templateUrl: './view-booking.component.html',
  styleUrls: ['./view-booking.component.css']
})
export class ViewBookingComponent implements OnInit {
  customer: addBookingDetails = new addBookingDetails(0,0," ",0);
bookingId:number;
account:any=[];
status:boolean;
  constructor(private service:FlightService ,private router:Router) { }

  ngOnInit(): void {
  }
  fetch(){
    this.status=true;
    let resp=this.service.showBooking(this.bookingId);
    resp.subscribe((data)=>this.account=data);
    console.log(this.account);
    if(this.account==null){
    this.status=false;
    alert("The Entered Id is not present in the booking details!!!!");
    }
    else
    this.status=true;
}
update()
{
  this.router.navigate(['add-booking']);
}
}

