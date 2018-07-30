package guru.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.repository.GreetingRepository;

@Service
@Profile("de")
@Primary 
public class PrimayGermanGreetingServiceImpl implements GreetingService{
	
	private GreetingRepository greetingRepository;
	
	
	
	public PrimayGermanGreetingServiceImpl(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}



	@Override
	public String sayGreating() {
		return greetingRepository.getGermanGreeting();
	}

}
