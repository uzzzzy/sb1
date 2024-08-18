package id.my.avzy.sb1;

import foo.bar.WelcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sb1Application {
	public static void main(String[] args) {
		SpringApplication.run(Sb1Application.class, args);

		var welcomeMessage = new WelcomeMessage();
		System.out.println(welcomeMessage.getWelcomeMessage());
	}
}
