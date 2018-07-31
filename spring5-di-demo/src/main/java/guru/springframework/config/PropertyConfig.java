package guru.springframework.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import guru.springframework.bean.FakeDataSource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

	private static String VAR = "JAVA_HOME";
	
	@Value("${guru.username}")
	private String user;

	@Value("${guru.password}")
	private String password;

	@Value("${guru.dburl}")
	private String url;

	@Autowired
	private Environment env;

	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(env.getProperty(VAR));
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		return fakeDataSource;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}
}
