export interface ScheduleFlight{
    flightNumber:number
    scheduleFlightId:number
    schedule:Schedule
}    

export interface Schedule{
    scheduleId:number
    sourceAirport:String
    destinationAirport:String
    arrivalDate:String
    departureDate:String
    

}
