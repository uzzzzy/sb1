package id.my.avzy.sb1;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {
    public String getWelcomeMessage() {
        return "Welcome to Spring Boot!";
    }
}
