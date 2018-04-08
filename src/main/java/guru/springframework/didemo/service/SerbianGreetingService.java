package guru.springframework.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("sr")
public class SerbianGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Pozdrav iz SerbianGreetingService-a";
    }
}
