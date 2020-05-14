package com.capgemini;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;

import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.capgemini.entity.Schedule;
import com.capgemini.entity.ScheduleFlight;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
@SpringBootTest
public class ScheduleFlightsApplicationTests {

	@Test
	public void testScheduling() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
	    final String baseUrl = "http://localhost:" + 8093 + "/flight/update";
	    URI uri = new URI(baseUrl);

	  LocalDateTime localDateTime2 = LocalDateTime.of(2019, 03, 28, 15, 33, 48, 123456789);
      LocalDateTime localDateTime1 = LocalDateTime.of(2019, 03, 28, 14, 33, 48, 123456789);	    
	 ScheduleFlight schedule=new ScheduleFlight();
	 Schedule scheduling=new Schedule();
	schedule.setFlightNumber(17771);
		scheduling.setSourceAirport("Mysore");
		scheduling.setDestinationAirport("Pune");
		scheduling.setArrivalDate(localDateTime1);
		scheduling.setDepartureDate(localDateTime2);
		scheduling.setScheduleId(190);
		schedule.setSchedule(scheduling);
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-COM-PERSIST", "Flight is Scheduled");
		 HttpEntity<ScheduleFlight> request = new HttpEntity<>(schedule, headers);
		 ResponseEntity<String> result = restTemplate.exchange(uri,HttpMethod.PUT, request,String.class);
		 Assert.assertEquals(200, result.getStatusCodeValue());
	    Assert.assertNotNull(schedule);
		
	}
}
