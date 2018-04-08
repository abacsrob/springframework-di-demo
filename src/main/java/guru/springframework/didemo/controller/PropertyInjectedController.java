package guru.springframework.didemo.controller;

import guru.springframework.didemo.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    public GreetingService greetingService;

    String greet() {
        return greetingService.getGreeting();
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }
}
