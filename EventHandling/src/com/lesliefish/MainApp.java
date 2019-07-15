package com.lesliefish;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        context.start();

        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.getMessage();

        context.stop();
    }
}
