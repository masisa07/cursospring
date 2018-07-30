package guru.service.impl;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

	public static final String HOLA = "Hola a todos!!!. Estoy inyectando mediante un constructor";

	@Override
	public String sayGreating() {
		return HOLA;
	}

}
