package com.mytodo.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class BasicAuthenticationController {

	@GetMapping(path = "/basicauth")
	public AuthenticationBean helloWorldBean() {
		//throw new RuntimeException("Some Error has Happened! Contact Support at ***-***");
		System.out.println("You are authenticated");
		return new AuthenticationBean("You are authenticated");
	}	
}
