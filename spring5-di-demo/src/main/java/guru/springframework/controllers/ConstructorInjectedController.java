package guru.springframework.controllers;

import guru.springframework.service.GreetingService;

public class ConstructorInjectedController {
	private GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	String sayHello() {
		return greetingService.sayGreating();
	}

}
