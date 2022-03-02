package com.npcibankingproject.npcibankingproject.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class RestExceptionHandler {
	
	@ExceptionHandler(value = CustomerDoesNotExist.class)
	public ResponseEntity<ApiError> handleCustomerDoesNotExist() {
		ApiError err = new ApiError(400, "No Product Found", new Date());
		return new ResponseEntity<ApiError>(err,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = InSufficientBalance.class)
	public ResponseEntity<ApiError> handleInsufficientBalance(){
		ApiError err = new ApiError(417, "Insufficent Balance", new Date());
		return new ResponseEntity<ApiError>(err, HttpStatus.EXPECTATION_FAILED);
	}
}
