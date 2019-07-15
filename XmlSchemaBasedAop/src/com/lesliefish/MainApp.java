package com.lesliefish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Student student = context.getBean(Student.class);
        student.getName();
        student.getAge();
        student.printThrowException();

        OtherClass otherClass = context.getBean(OtherClass.class);
        otherClass.getName();
        otherClass.getType();
    }
}
