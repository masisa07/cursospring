package guru.springframework.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.repository.GreetingRepository;
import guru.springframework.service.GreetingService;

@Service
@Profile("es")
@Primary
public class PrimaySpanishGreetingServiceImpl implements GreetingService {

	private GreetingRepository greetingRepository;

	public PrimaySpanishGreetingServiceImpl(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreating() {
		return greetingRepository.getSpanishGreeting();
	}

}
