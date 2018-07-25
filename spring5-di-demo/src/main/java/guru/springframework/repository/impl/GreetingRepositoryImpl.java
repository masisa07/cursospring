package guru.springframework.repository.impl;

import org.springframework.stereotype.Component;

import guru.springframework.repository.GreetingRepository;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

	@Override
	public String getEnglishGreeting() {
		return "Hello - Primary Greeting service [EN]";
	}

	@Override
	public String getSpanishGreeting() {
		return "Hola - Primary Greeting service [ES]";
	}

	@Override
	public String getGermanGreeting() {
		return "Hello - Primary Greeting service [DE]";
	}

}
