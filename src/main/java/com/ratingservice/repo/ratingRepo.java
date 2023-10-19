package com.ratingservice.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ratingservice.util.Rating;

public interface ratingRepo extends MongoRepository<Rating, Long>{
	
	Optional<List<Rating>> findByUserId(long id);

}
