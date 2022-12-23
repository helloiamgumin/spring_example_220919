package com.example.lesson03.dao;

import org.springframework.stereotype.Repository;

import com.example.lesson03.model.Review;

@Repository
public interface ReviewDAO {

	public Review selectReview(int id); // 1개면 @Param 안써도 됌
}
