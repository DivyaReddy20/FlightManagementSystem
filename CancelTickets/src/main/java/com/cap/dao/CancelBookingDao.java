package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.dto.BookingDetails;
@Repository
public interface CancelBookingDao extends JpaRepository<BookingDetails, Integer>{

}
