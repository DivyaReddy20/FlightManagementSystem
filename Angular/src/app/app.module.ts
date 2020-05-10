import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BookFlightComponent } from './book-flight/book-flight.component';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { FlightService } from './flight.service';
import { BookingTicketsComponent } from './booking-tickets/booking-tickets.component';
import { CancelTicketsComponent } from './cancel-tickets/cancel-tickets.component';
import { ViewBookingComponent } from './view-booking/view-booking.component';

@NgModule({
  declarations: [
    AppComponent,
    BookFlightComponent,
    BookingTicketsComponent,
    CancelTicketsComponent,
    ViewBookingComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [HttpClient,FlightService],
  bootstrap: [AppComponent]
})
export class AppModule { }
