package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.service.GreetingService;

@Controller
public class PropertyInjectedController {

	@Autowired
	public GreetingService greetingServiceImpl;


	public String sayHello() {
		return greetingServiceImpl.sayGreating();
	}

}
