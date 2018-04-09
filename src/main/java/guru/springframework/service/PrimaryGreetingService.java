package guru.springframework.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Primary
@Profile({"en", "default"})
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String getGreeting() {
        return "Greeting from the Primary Greeting Service";
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("in PrimaryGreetingService.postConstruct()");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("in PrimaryGreetingService.preDestroy()");
    }
}
