package guru.springframework.didemo.controller;

import guru.springframework.didemo.service.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void test() throws Exception {
        Assert.assertEquals(GreetingServiceImpl.GREETING, propertyInjectedController.greet());
    }
}
