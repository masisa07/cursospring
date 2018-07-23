package guru.springframework.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.service.GreetingService;

@Service
@Profile({"en", "default"})
@Primary 
public class PrimayGreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreating() {
		return "Hello - PrimaryGreeting en inglés";
	}

}
