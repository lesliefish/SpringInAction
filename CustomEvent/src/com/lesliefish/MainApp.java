package com.lesliefish;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        CustomEventPublisher publisher = context.getBean(CustomEventPublisher.class);
        publisher.publish();
        publisher.publish();
    }
}
