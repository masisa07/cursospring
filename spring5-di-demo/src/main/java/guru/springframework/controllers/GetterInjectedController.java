package guru.springframework.controllers;

import guru.springframework.service.GreetingService;

public class GetterInjectedController {

	private GreetingService greetingService;

	public GreetingService getGreetingService() {
		return greetingService;
	}

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	String sayHello() {
		return greetingService.sayGreating();
	}
	
	
	
}
