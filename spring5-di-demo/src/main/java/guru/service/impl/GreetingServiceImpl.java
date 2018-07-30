package guru.service.impl;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

	public static final String HOLA = "Hola a todos!!! - Original"; 
	
	@Override
	public String sayGreating() {
		return HOLA;
	}

}