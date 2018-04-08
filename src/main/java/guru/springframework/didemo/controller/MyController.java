package guru.springframework.didemo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String helloWorld() {
        return "Hello world!";
    }
}
