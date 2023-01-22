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
	@GetMapping("/app1path1")
	public String roothello() {
		
		return "all users from app1 path1";
		
		
	}
	@GetMapping("/app1path2")
	public String pathhello() {
		
		return "all  users from app1 path2";
		
		
	}
}

