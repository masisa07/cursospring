package guru.springframework.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.service.GreetingService;

@Service
@Profile("es")
@Primary 
public class PrimayGermanGreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreating() {
		return "Hola - PrimaryGreeting en Español";
	}

}
