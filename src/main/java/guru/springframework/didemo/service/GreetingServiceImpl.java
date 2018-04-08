package guru.springframework.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public static final String GREETING = "This is a greeting.";
    @Override
    public String getGreeting() {
        return GREETING;
    }
}
