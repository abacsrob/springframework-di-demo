package guru.springframework.didemo;

import guru.springframework.didemo.controller.ConstructorInjectedController;
import guru.springframework.didemo.controller.MyController;
import guru.springframework.didemo.controller.PropertyInjectedController;
import guru.springframework.didemo.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController c = (MyController) ctx.getBean("myController");
        LifeCycleBeanDemo lBean = (LifeCycleBeanDemo) ctx.getBean("lifeCycleBeanDemo");

        System.out.println(c.helloWorld());

        System.out.println(ctx.getBean(PropertyInjectedController.class).greet());
        System.out.println(ctx.getBean(SetterInjectedController.class).greet());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).greet());
    }
}
