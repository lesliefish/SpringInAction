package com.lesliefish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        BeanTest test = context.getBean(BeanTest.class);
        test.getMessage();
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
    }
}
