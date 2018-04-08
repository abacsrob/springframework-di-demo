package guru.springframework.didemo.controller;

import guru.springframework.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

//    @Autowired
//    @Qualifier("greetingServiceImpl")
//    public GreetingService greetingService;

    @Autowired
    public GreetingService greetingServiceImpl;

    public String greet() {
//        return greetingService.getGreeting();
        return greetingServiceImpl.getGreeting();
    }

    public GreetingService getGreetingService() {
//        return greetingService;
        return greetingServiceImpl;
    }
}
