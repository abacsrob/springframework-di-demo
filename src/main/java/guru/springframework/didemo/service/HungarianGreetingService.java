package guru.springframework.didemo.service;

public class HungarianGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public HungarianGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String getGreeting() {
        return greetingRepository.getHungarianGreeting();
    }
}
