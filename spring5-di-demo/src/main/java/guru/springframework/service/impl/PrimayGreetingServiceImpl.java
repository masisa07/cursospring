package guru.springframework.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.repository.GreetingRepository;
import guru.springframework.service.GreetingService;

@Service
@Profile({ "en", "default" })
@Primary
public class PrimayGreetingServiceImpl implements GreetingService {

	private GreetingRepository greetingRepository;

	public PrimayGreetingServiceImpl(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreating() {
		return greetingRepository.getEnglishGreeting();
	}

}
