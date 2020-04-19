package com.example.logDemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.logDemo.DemoApplication;

@RestController
@RequestMapping("/hello")
public class HelloController {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	
	 
	 @GetMapping("/greeting")
	public String greeting()
	{
		int a = 10;
		int b = 12;
		System.out.println("addition is : "+ (a+b));
		logger.info("inside hello controller");
		logger.info("addition is in logs: {}",(a+b));
		return "a";
	}
}
