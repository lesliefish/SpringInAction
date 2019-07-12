package com.lesliefish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        //Thread.sleep(111111); // 测试lazy-init  true时 用到再创建; false 时context new时就创建
        BeanDefine beanDefine = context.getBean(BeanDefine.class);

        System.out.println("message is " + beanDefine.getMessage());
    }
}
