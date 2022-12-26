package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;
import com.example.lesson03.model.Review;

@RequestMapping("/lesson03/ex02")
@RestController
public class Lesson03Ex02RestController {

	@Autowired
	private ReviewBO reviewBO;
	
	// http://localhost/lesson03/ex02/1
	@RequestMapping("/1")
	public String ex02_1() {
		Review review = new Review();
		review.setStoreId(3);
		review.setMenu("블랙타이거슈림프");
		review.setUserName("권규민");
		review.setPoint(5.0);
		review.setReview("가격이 비싸도 끊을 수 없는 맛입니다ㅎㅎ");
		
		int row = reviewBO.addReview(review);
		return "성공한 행의 개수:" + row; // html 
	}
	
	// http://localhost/lesson03/ex02/2
	@RequestMapping("/2")
	public String ex02_2() {
		int row = reviewBO.addReviewAsField(4, "콤비네이션R", "신바다", 5.0, "역시 맛있따!");
		return "success row count : " + row;
	}
}
