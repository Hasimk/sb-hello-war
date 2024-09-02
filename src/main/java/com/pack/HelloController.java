package com.pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	
	

	@GetMapping("/hello")
	public String helloWorld(String s1) {
		return "Hello from springboot";
		
		
		
		
	}

}
