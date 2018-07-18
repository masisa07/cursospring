package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.controllers.MyController;

@SpringBootApplication
public class DiDemoApplication {
	
	private static final String MYCONTROLLER = "myController";

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean(MYCONTROLLER);
		controller.hello();
	}
}
