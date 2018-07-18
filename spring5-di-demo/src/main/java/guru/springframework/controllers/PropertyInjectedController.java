package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.service.impl.GreetingServiceImpl;

@Controller
public class PropertyInjectedController {

	@Autowired
	public GreetingServiceImpl greetingService;


	public String sayHello() {
		return greetingService.sayGreating();
	}

}
