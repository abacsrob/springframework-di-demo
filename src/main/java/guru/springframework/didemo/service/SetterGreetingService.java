package guru.springframework.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Greeting from the Setter Greeting Service";
    }
}
