package ua.lviv.lgs.Project_10;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CustomConfiguration {
	
	@Bean(name="client")
	public Student getClient(@Qualifier("user")User user ) {
		Student c = new Student(user);
		user.setFirst_name("Roman");
		user.setLast_name("Sukhai");
		c.setId(1);
		return c;
	}
	
	@Bean(name="consoleevenlogger")
	public ConsoleEventLogger getConsoleEventLogger() {
		return new ConsoleEventLogger();
		
	}
	
	@Bean(name="user")
	public User getuser() {
		return new User();
	}
	
}
