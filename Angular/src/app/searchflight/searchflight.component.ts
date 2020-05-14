import { Component, OnInit } from '@angular/core';
import { FlightService,  Flights } from '../flight.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-searchflight',
  templateUrl: './searchflight.component.html',
  styleUrls: ['./searchflight.component.css']
})
export class SearchflightComponent implements OnInit {
  searchs: Flights[];
   valid: any;
   message: any;
   error: boolean;
 result:any;
 status:boolean;
   constructor(private service: FlightService,private router:Router) { 
     this.status=false;
   }
   onSubmit(SearchFlight:Flights) {
 console.log(SearchFlight);
 this.valid = this.validation(SearchFlight.fromloc,SearchFlight.toloc,SearchFlight.date1);
 if(this.valid)
     this.service.getSearchFlights(SearchFlight).subscribe(
       response => this.handleSuccessfulResponse(response),
     );
 
   }
   handleSuccessfulResponse(response) {
     this.status=true;
     this.searchs = response;
     
   }
 
   ngOnInit() {
   }
   validation(fromloc: any, toloc: any,date1:any): any {
     this.valid = true;
     this.message='';
     if(fromloc =='' || toloc =='' || date1 ==''){
       this.error=true;
       this.message='Fill all the fields!!';
       this.valid = false;
     }
     return this.valid;
 }
 bookings(){
  this.router.navigate(['add-booking']);
  }
 }