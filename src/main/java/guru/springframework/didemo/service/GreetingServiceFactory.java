package guru.springframework.didemo.service;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String langId) {
        switch (langId) {
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "hu":
                return new HungarianGreetingService(greetingRepository);
            case "rs":
                return new SerbianGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }
}
