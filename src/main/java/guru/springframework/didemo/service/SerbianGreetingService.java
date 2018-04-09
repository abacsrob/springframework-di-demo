package guru.springframework.didemo.service;

public class SerbianGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public SerbianGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String getGreeting() {
        return greetingRepository.getSerbianGreeting();
    }
}
