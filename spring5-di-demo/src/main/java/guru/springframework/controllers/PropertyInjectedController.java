package guru.springframework.controllers;

import guru.springframework.service.impl.GreetingServiceImpl;

public class PropertyInjectedController {

	public GreetingServiceImpl greetingService;

//	public GreetingServiceImpl getGreetingService() {
//		return greetingService;
//	}

	String sayHello() {
		return greetingService.sayGreating();
	}

}
