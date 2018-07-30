package guru.service.impl;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingServiceImpl implements GreetingService {
	public static final String HOLA = "Hola a todos!!!. Estoy inyectando mediante un getter";

	@Override
	public String sayGreating() {
		return HOLA;
	}

}
