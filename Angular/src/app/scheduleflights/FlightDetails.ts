export interface Flight{
 
    flights:number
    carrierName:string
    flightModel:string
    seatCapacity:number
    scheduleFlight:ScheduleFlight
    }

    export interface ScheduleFlight{
        flightNumber:number
    }    