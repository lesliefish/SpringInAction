package com.lesliefish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        StudentJDBCTemplate studentJDBCTemplate = context.getBean(StudentJDBCTemplate.class);

        System.out.println("------Records Creation--------");
        studentJDBCTemplate.create("Zara", 11);
        studentJDBCTemplate.create("Nuha", 2);
        studentJDBCTemplate.create("Ayan", 15);

        System.out.println("------Listing Multiple Records--------");
        List<Student> students = studentJDBCTemplate.listStudents();

        for (Student record : students) {
            System.out.print("ID : " + record.getId());
            System.out.print(", Name : " + record.getName());
            System.out.println(", Age : " + record.getAge());
        }
        System.out.println("----Listing Record with ID = 2 -----");
        Student student = studentJDBCTemplate.getStudent(2);
        System.out.print("ID : " + student.getId());
        System.out.print(", Name : " + student.getName());
        System.out.println(", Age : " + student.getAge());
    }
}

/*
七月 15, 2019 4:21:12 下午 org.springframework.context.support.ClassPathXmlApplicationContext prepareRefresh
信息: Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@27fa135a: startup date [Mon Jul 15 16:21:12 CST 2019]; root of context hierarchy
七月 15, 2019 4:21:12 下午 org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
信息: Loading XML bean definitions from class path resource [Beans.xml]
七月 15, 2019 4:21:12 下午 org.springframework.jdbc.datasource.DriverManagerDataSource setDriverClassName
信息: Loaded JDBC driver: com.mysql.cj.jdbc.Driver
------Records Creation--------
Created Record Name = Zara Age = 11
Created Record Name = Nuha Age = 2
Created Record Name = Ayan Age = 15
------Listing Multiple Records--------
ID : 1, Name : Zara, Age : 11
ID : 2, Name : Nuha, Age : 2
ID : 3, Name : Ayan, Age : 15
----Listing Record with ID = 2 -----
ID : 2, Name : Nuha, Age : 2
 */