package com.ratingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ratingservice.service.RatingService;
import com.ratingservice.util.Rating;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@Autowired
	private RatingService ratingservice;
	
	
	@PostMapping("/create")
	public ResponseEntity<Rating> createuser(@RequestBody Rating rating){
		
		Rating createuser = ratingservice.createRating(rating);
		
		return new ResponseEntity<Rating>(createuser,HttpStatus.OK);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<List<Rating>> getuser(@PathVariable long id ){
		
		List<Rating> user1 = ratingservice.getuserRating(id);
		
		return new ResponseEntity<List<Rating>>(user1,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Rating>> getalluser(){
		
		List<Rating> allUser = ratingservice.getAllRating();
		
		
		return new ResponseEntity<List<Rating>>(allUser,HttpStatus.OK);
	}
	

}
