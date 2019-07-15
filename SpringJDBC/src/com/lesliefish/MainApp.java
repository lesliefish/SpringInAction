package com.lesliefish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        StudentDaoImpl studentDaoImpl = context.getBean(StudentDaoImpl.class);
        studentDaoImpl.create("lesliefish", 18);
        studentDaoImpl.create("Zara", 11);
        studentDaoImpl.create("Nuha", 2);
        studentDaoImpl.create("Ayan", 15);
        System.out.println("------Listing Multiple Records--------");
        List<Student> students = studentDaoImpl.listStudents();
        for (Student record : students) {
            System.out.print("ID : " + record.getId());
            System.out.print(", Name : " + record.getName());
            System.out.println(", Age : " + record.getAge());
        }
        System.out.println("----Updating Record with ID = 2 -----");
        studentDaoImpl.update(2, 20);
        System.out.println("----Listing Record with ID = 2 -----");
        Student student = studentDaoImpl.getStudent(15);
        System.out.print("ID : " + student.getId());
        System.out.print(", Name : " + student.getName());
        System.out.println(", Age : " + student.getAge());
    }
}

/*
Created Record Name = lesliefish Age = 18
Created Record Name = Zara Age = 11
Created Record Name = Nuha Age = 2
Created Record Name = Ayan Age = 15
------Listing Multiple Records--------
ID : 14, Name : lesliefish, Age : 18
ID : 15, Name : Zara, Age : 11
ID : 16, Name : Nuha, Age : 2
ID : 17, Name : Ayan, Age : 15
----Updating Record with ID = 2 -----
Updated Record with ID = 2
----Listing Record with ID = 2 -----
ID : 15, Name : Zara, Age : 11
*/