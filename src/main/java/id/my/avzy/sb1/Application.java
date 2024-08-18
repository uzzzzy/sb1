package id.my.avzy.sb1;

import id.my.avzy.sb1.run.Location;
import id.my.avzy.sb1.run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class Application {
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner() {
		return (args) -> {
			Run run = new Run(1, "Run 1", LocalDateTime.now(), LocalDateTime.now().plusHours(1), 100, Location.INDOOR);
			log.info("Run: " + run);
		};
	}
}
