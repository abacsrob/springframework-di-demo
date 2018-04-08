package guru.springframework.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleBeanDemo implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleBeanDemo() {
        System.out.println("### In LifeCycleBeanDemo constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("### In LifeCycleBeanDemo.setBeanFactory");

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("### In LifeCycleBeanDemo.setBeanName");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("### In LifeCycleBeanDemo.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("### In LifeCycleBeanDemo.afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("### In LifeCycleBeanDemo.setApplicationContext");
    }

    public void beforeInit() {
        System.out.println("### In LifeCycleBeanDemo.beforeInit");
    }

    public void afterInit() {
        System.out.println("### In LifeCycleBeanDemo.afterInit");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("### In LifeCycleBeanDemo.postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("### In LifeCycleBeanDemo.preDestroy");
    }
}
