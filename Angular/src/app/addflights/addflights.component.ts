import { Component, OnInit } from '@angular/core';
import { FlightService } from '../flight.service';
import { Flight } from '../scheduleflights/FlightDetails';


@Component({
  selector: 'app-addflights',
  templateUrl: './addflights.component.html',
  styleUrls: ['./addflights.component.css']
})
export class AddflightsComponent implements OnInit {
  flight: Flight= {flights:0,carrierName:'',flightModel:'',seatCapacity:0, scheduleFlight:{flightNumber:0}}
  result:string;
  constructor(private flightservice:FlightService) { }

  ngOnInit(){
  }
  onSubmit():void{
    this.flightservice.AddFlight(this.flight)
         .subscribe(data => {this.result=data});
            
}
}
