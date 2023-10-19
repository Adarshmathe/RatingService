package com.ratingservice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratingservice.repo.ratingRepo;
import com.ratingservice.service.RatingService;
import com.ratingservice.util.Rating;
import com.ratingservice.util.customException;


@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	private ratingRepo ratingrepo;

	@Override
	public Rating createRating(Rating rating) {
		
		return ratingrepo.save(rating);
	}

	@Override
	public List<Rating> getuserRating(long id) {
		
		return ratingrepo.findByUserId(id).orElseThrow(()->new customException("601","Not found..!!"));
	}

	@Override
	public List<Rating> getAllRating() {
		// TODO Auto-generated method stub
		return ratingrepo.findAll();
	}

}
