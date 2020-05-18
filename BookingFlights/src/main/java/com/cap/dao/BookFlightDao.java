package com.cap.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cap.dto.BookingDetails;
@Repository
public interface BookFlightDao extends JpaRepository<BookingDetails, Integer>  {
	
	
	@Query("select d from BookingDetails d where d.userId=?1")
	BookingDetails displayOneBookingList(int userId);

}
