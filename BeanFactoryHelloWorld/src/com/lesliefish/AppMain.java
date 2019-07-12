package com.lesliefish;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld obj = applicationContext.getBean(HelloWorld.class);
        System.out.println("message is " + obj.getMessage());
    }

}
