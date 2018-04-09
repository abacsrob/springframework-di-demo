package guru.springframework.didemo.service;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository{
    @Override
    public String getEnglishGreeting() {
        return "Default greetings";
    }

    @Override
    public String getHungarianGreeting() {
        return "Udvozlet a HungarianGreetingService-bol";
    }

    @Override
    public String getSerbianGreeting() {
        return "Pozdrav iz SerbianGreetingService-a";
    }
}
