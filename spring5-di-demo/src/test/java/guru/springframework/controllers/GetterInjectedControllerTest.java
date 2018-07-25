package guru.springframework.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.service.impl.GreetingServiceImpl;

public class GetterInjectedControllerTest {

	private  GetterInjectedController getterInjectedController;
	
	@Before
	public void setUp() throws Exception {
		this.getterInjectedController = new  GetterInjectedController();
		this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting() throws Exception{
		assertEquals(GreetingServiceImpl.HOLA, getterInjectedController.sayHello());
	}	
}
