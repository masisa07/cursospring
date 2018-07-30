package guru.service.impl;

import guru.springframework.repository.GreetingRepository;

public class GreetingServiceFactory {
	 private GreetingRepository greetingRepository;

	    public GreetingServiceFactory(GreetingRepository greetingRepository) {
	        this.greetingRepository = greetingRepository;
	    }

	    public GreetingService createGreetingService(String lang) {

	        switch (lang){
	            case "en":
	                return new PrimayGreetingServiceImpl(greetingRepository);
	            case "de":
	                return new PrimayGermanGreetingServiceImpl(greetingRepository);
	            case "es":
	                return new PrimaySpanishGreetingServiceImpl(greetingRepository);
	            default:
	                return new PrimayGreetingServiceImpl(greetingRepository);
	        }

	    }
}
