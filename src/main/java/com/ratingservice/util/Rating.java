package com.ratingservice.util;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("ratings")
public class Rating {
	
	@Id
	private String ratingId;
	private long userId;
	private long hotelId;
	private String rating;
	private String feedback;

}
