package com.ratingservice.service;

import java.util.List;
import java.util.Optional;

import com.ratingservice.util.Rating;

public interface RatingService {
	
	Rating createRating(Rating rating);
	List<Rating> getuserRating(long id);
	List<Rating> getAllRating();

}
