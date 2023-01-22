package com.test.onescmbe.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
public class InitController {
	
	/*Test the rest call*/
	
	@GetMapping("/getdetails")
	public String hello() {
		
		return "all users";
		
		
	}
}

