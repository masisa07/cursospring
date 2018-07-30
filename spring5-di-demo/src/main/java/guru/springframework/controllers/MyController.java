package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

import guru.service.impl.GreetingService;

@Controller
public class MyController {
	
	private GreetingService greetingService;
	
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}


	public String hello() {
		System.out.println("HOLA MyController");
		
		return greetingService.sayGreating();
	}

}
