package guru.springframework.didemo.controller;

import guru.springframework.didemo.service.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void test() {
        Assert.assertEquals(GreetingServiceImpl.GREETING, setterInjectedController.greet());
    }
}
