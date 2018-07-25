package guru.springframework.service.impl;

import org.springframework.stereotype.Service;

import guru.springframework.service.GreetingService;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

	public static final String HOLA = "Hola a todos!!!. Estoy inyectando mediante un constructor";

	@Override
	public String sayGreating() {
		return HOLA;
	}

}
