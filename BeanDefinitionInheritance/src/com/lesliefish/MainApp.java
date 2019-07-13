package com.lesliefish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TestBean testBean = context.getBean(TestBean.class);
        System.out.println(testBean.getMessage());
        System.out.println(testBean.getType());
    }
}
