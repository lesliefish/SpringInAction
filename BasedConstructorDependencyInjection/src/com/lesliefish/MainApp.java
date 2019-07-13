package com.lesliefish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor textEditor = context.getBean(TextEditor.class);
        textEditor.spellCheck();

        // 多参
        MoreParams moreParams = context.getBean(MoreParams.class);
    }
}

/*
 SpellChecker 构造方法
 TextEditor 构造方法.
 SpellChecker checkSpelling
*/