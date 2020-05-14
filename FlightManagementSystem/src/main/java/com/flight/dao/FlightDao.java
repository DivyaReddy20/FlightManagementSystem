package com.flight.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.flight.entities.FlightData;


@Repository
public interface FlightDao extends JpaRepository<FlightData, Integer> {

	@Query("select e.flightNumber,e.flightName,e.fromloc,e.toloc,e.seatCapacity,e.costPerSeat,e.date1 from FlightData e where e.fromloc=?1 and e.toloc=?2 and e.date1=?3")

	List<FlightData> findFlight(String fromloc, String toloc,Date date1);

}