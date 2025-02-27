package com.demo.ms.ratingservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.demo.ms.ratingservice.payloads.ApiResponse;


@RestControllerAdvice
public class GlobalExceptionHandler  {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourceNotFound(ResourceNotFoundException e){
		ApiResponse res = ApiResponse.builder().message(e.getMessage()).success(true).status(HttpStatus.NOT_FOUND).build();
		return new ResponseEntity<ApiResponse>(res,HttpStatus.NOT_FOUND);
	}

}
