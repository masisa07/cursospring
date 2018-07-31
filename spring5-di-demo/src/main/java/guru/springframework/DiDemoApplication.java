package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import guru.springframework.bean.FakeDataSource;
import guru.springframework.bean.MssFakeDataSource;

@SpringBootApplication
@ComponentScan(basePackages= {"guru.service", "guru.springframework"})
public class DiDemoApplication {

	private static final String MYCONTROLLER = "myController";

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
//		MyController controller = (MyController) ctx.getBean(MYCONTROLLER);
		
//		controller.hello();
//		
//		System.out.println(controller.hello());
//
//		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
		
		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		
		System.out.println("-----------------> "+fakeDataSource.getUser());
		
		MssFakeDataSource mssFakeDataSource = (MssFakeDataSource) ctx.getBean(MssFakeDataSource.class);
		
		System.out.println("-----------------> "+mssFakeDataSource.getPassword());
		
	}
}
