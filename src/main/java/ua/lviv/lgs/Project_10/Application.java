package ua.lviv.lgs.Project_10;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ao = SpringApplication.run(Application.class, args);
		
		Student cl = (Student) ao.getBean("client");
		
		ConsoleEventLogger co = (ConsoleEventLogger) ao.getBean("consoleevenlogger");
		
		co.logEvent(cl.getId()+"---->"+cl.getUser().getFirst_name()+"---->"+cl.getUser().getLast_name());
		
		
	}
}
