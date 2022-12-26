package com.example.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson03.model.Review;

@Repository
public interface ReviewDAO {

	public Review selectReview(int id); // 1개면 @Param 안써도 됌
	
	public int insertReview(Review review);
	
	public int insertReviewAsField(
			// 하나의 맵으로 구성됨(@Param)
			@Param("storeId") int storeId, 
			@Param("menu") String menu, 
			@Param("userName") String userName,
			@Param("point") Double point, 
			@Param("review") String review);
}
