package guru.springframework.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import guru.springframework.service.GreetingService;

@Service
@Primary

public class PrimayGreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreating() {
		return "Hola - PrimaryGreeting";
	}

}
