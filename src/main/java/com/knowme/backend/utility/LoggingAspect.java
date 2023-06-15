package com.knowme.backend.utility;


import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
//	@AfterThrowing
//	public void logExceptionFromService(Exception exception) throws Exception{
//		log(exception);
//	}
//	
//	public void log(Exception exception) {
//		Logger logger = LoggerFactory.getLogger(this.getClass());
//		if(exception.getMessage() != null) {
//			logger.error(exception.getMessage());
//		}
//		else {
//			logger.error(exception.getMessage(),exception);
//		}
//	}

}
