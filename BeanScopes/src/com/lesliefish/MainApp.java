package com.lesliefish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        // 单例
        {
            Singleton s1 = context.getBean(Singleton.class);
            Singleton s2 = context.getBean(Singleton.class);
            s1.getMessage();
            s2.getMessage();
            System.out.println(s1);
            System.out.println(s1);
            /*
            message is : singleton
            message is : singleton
            com.lesliefish.Singleton@3532ec19
            com.lesliefish.Singleton@3532ec19
            */
        }

        // 原型
        {
            Prototype p1 = context.getBean(Prototype.class);
            Prototype p2 = context.getBean(Prototype.class);
            p1.getMessage();
            p2.getMessage();
            System.out.println(p1);
            System.out.println(p2);
            /*
            message is : prototype
            message is : prototype
            com.lesliefish.Prototype@68c4039c
            com.lesliefish.Prototype@ae45eb6
            */
        }

    }
}
