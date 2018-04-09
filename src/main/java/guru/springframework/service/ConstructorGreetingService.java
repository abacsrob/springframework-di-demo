package guru.springframework.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Greeting from the Constructor Greeting Service";
    }
}
