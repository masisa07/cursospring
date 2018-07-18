package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.service.GreetingService;

@Controller
public class GetterInjectedController {

	private GreetingService greetingService;

	@Autowired
	@Qualifier("getterGreetingServiceImpl")
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreating();
	}
	
	
	
}
