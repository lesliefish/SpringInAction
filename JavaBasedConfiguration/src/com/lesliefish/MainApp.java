package com.lesliefish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.setMessage("ABCDEFG");
        helloWorld.getMessage();

        ApplicationContext context2 = new AnnotationConfigApplicationContext(TextEditorConfig.class);
        TextEditor te = context2.getBean(TextEditor.class);
        te.spellCheck();
    }
}
