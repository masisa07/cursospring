package guru.springframework.service.impl;

import org.springframework.stereotype.Service;

import guru.springframework.service.GreetingService;

@Service
public class GetterGreetingServiceImpl implements GreetingService {
	public static final String HOLA = "Hola a todos!!!. Estoy inyectando mediante un getter";

	@Override
	public String sayGreating() {
		return HOLA;
	}

}
