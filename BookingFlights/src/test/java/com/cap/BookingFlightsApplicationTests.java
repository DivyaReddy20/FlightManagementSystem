package com.cap;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.cap.dto.BookingDetails;

@SpringBootTest
public class BookingFlightsApplicationTests {

@Test
	public void bookTicketsTest() throws URISyntaxException //test case for booking tickets--success
	{
	RestTemplate restTemplate = new RestTemplate();
    
	final String baseUrl = "http://localhost:8091/Flights/addBooking";
	URI uri = new URI(baseUrl);
	 BookingDetails book = new BookingDetails();
	    book.setBookingId(5);
	    book.setPassengerName("kruthi");
	    book.setUserId(9);
	    book.setNoofSeats(3);
	    HttpHeaders headers = new HttpHeaders();
	    headers.set("X-COM-PERSIST", "true");      
	    HttpEntity<BookingDetails> request = new HttpEntity<>(book, headers);
	    
	    ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
	    Assert.assertEquals(200, result.getStatusCodeValue());
	    Assert.assertNotNull(book);
	}
	
	@Test
	public void bookTicketsTest1() throws URISyntaxException //test case for booking tickets-- fail 
	{
	RestTemplate restTemplate = new RestTemplate();
    
	final String baseUrl = "http://localhost:8091/Flights/addBooking";
	URI uri = new URI(baseUrl);
	 BookingDetails book = new BookingDetails();
	    book.setBookingId(5);
	    book.setPassengerName("kruthi");
	    book.setUserId(9);
	    book.setNoofSeats(3);
	    HttpHeaders headers = new HttpHeaders();
	    headers.set("X-COM-PERSIST", "true");      
	    HttpEntity<BookingDetails> request = new HttpEntity<>(book, headers);
	    
	    ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
	    Assert.assertEquals(302, result.getStatusCodeValue());
	    Assert.assertNotNull(book);
	}
	
	@Test
	public void getBookingDetailsTrue() throws URISyntaxException // get booking details of a passenger-- status --success
	{
	    RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:"+8091+"/Flights/get/64";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<BookingDetails> result = restTemplate.getForEntity(uri, BookingDetails.class);
	    BookingDetails data = result.getBody();
	    Assert.assertEquals(200, result.getStatusCodeValue());
	    Assert.assertNotNull(data);
	}
	@Test   
	public void getBookingDetailsFalse() throws URISyntaxException // get booking details of a passenger-- status --fail
	{
	    RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:"+8091+"/Flights/get/4";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<BookingDetails> result = restTemplate.getForEntity(uri, BookingDetails.class);
	    Assert.assertEquals(400, result.getStatusCodeValue());
	}
	////cancel tickets junit test cases
	@Test
	public void cancelTicketsTest() throws URISyntaxException 
	{
	RestTemplate restTemplate = new RestTemplate();
	final String baseUrl = "http://localhost:8091/Flights/cancelBooking/41";
	URI uri = new URI(baseUrl);
	ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.DELETE, null, String.class);
	Assert.assertEquals(200, result.getStatusCodeValue());
}
	@Test
	public void cancelTicketsTest2() throws URISyntaxException 
	{
	RestTemplate restTemplate = new RestTemplate();
    
	final String baseUrl = "http://localhost:8091/Flights/cancelBooking/48";
	URI uri = new URI(baseUrl);
	ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.DELETE, null, String.class);
	Assert.assertEquals(500, result.getStatusCodeValue());
}
	
	

}
