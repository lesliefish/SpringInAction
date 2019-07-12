package com.lesliefish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);

        System.out.println("message is " + helloWorld.getMessage());
    }
}
