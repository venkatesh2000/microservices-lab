package com.example.demojunitteset;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@RequestMapping("/greeting")
	public String sendGreeting()
	{
	    return "Hello World !!";
	}

}
