package com.demo.ms.ratingservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.ms.ratingservice.entities.Rating;

@Repository
public interface IRatingRepository  extends JpaRepository<Rating, String> {

	List<Rating> findByUserId(String userId);
	
	List<Rating> findByHotelId(String hotelId);
}
