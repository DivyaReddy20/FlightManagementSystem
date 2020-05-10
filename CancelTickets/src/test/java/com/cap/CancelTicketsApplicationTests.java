package com.cap;

import java.net.URI;
import java.net.URISyntaxException;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
public class CancelTicketsApplicationTests {

	@Test
	public void cancelTicketsTest() throws URISyntaxException 
	{
	RestTemplate restTemplate = new RestTemplate();
    
	final String baseUrl = "http://localhost:8092/Flights/cancelBooking/41";
	URI uri = new URI(baseUrl);
	ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.DELETE, null, String.class);
	Assert.assertEquals(200, result.getStatusCodeValue());
}
	@Test
	public void cancelTicketsTest2() throws URISyntaxException 
	{
	RestTemplate restTemplate = new RestTemplate();
    
	final String baseUrl = "http://localhost:8092/Flights/cancelBooking/48";
	URI uri = new URI(baseUrl);
	ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.DELETE, null, String.class);
	Assert.assertEquals(500, result.getStatusCodeValue());
}
	
}