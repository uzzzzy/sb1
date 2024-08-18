package id.my.avzy.sb1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sb1Application {
	private static final Logger log = LoggerFactory.getLogger(Sb1Application.class);
	public static void main(String[] args) {

		SpringApplication.run(Sb1Application.class, args);

		log.info("Sb1 Application Started");
	}
}
