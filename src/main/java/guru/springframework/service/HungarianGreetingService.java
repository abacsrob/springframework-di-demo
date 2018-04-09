package guru.springframework.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("hu")
public class HungarianGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Udvozlet a HungarianGreetingService-bol";
    }
}
