import { Component, OnInit } from '@angular/core';
import { FlightService } from '../flight.service';
import { ScheduleFlight } from './schedule';

@Component({
  selector: 'app-scheduleflights',
  templateUrl: './scheduleflights.component.html',
  styleUrls: ['./scheduleflights.component.css']
})
export class ScheduleflightsComponent implements OnInit {
 
  scheduling:ScheduleFlight={flightNumber:0,scheduleFlightId:0,
  schedule:{scheduleId:0,sourceAirport:'',destinationAirport:'',arrivalDate:"",departureDate:""}}
    result:string;

  constructor(private scheduleservice:FlightService) {
    
    }

  ngOnInit() {}
  onSubmit():void{
    
    this.scheduleservice.updateSchedule(this.scheduling)
        .subscribe(data => {this.result=data},
          error=>{console.log("exception occured" );
        this.result="FlightNumber not exists";
        }
          
          )
}
}