package guru.springframework.service.impl;

import org.springframework.stereotype.Service;

import guru.springframework.service.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService {

	public static final String HOLA = "Hola a todos!!! - Original"; 
	
	@Override
	public String sayGreating() {
		return HOLA;
	}

}