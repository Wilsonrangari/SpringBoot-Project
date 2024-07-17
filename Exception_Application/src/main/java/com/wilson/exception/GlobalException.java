package com.wilson.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalException {
	
	private static final Logger logger = LoggerFactory.getLogger(GlobalException.class);
	
	@ExceptionHandler(value = Exception.class)
	public String exceptionHandler(Exception e) {
		String msg = e.getMessage();
		logger.error(msg);
		return "errorPage";
	}
	
	
	

}
