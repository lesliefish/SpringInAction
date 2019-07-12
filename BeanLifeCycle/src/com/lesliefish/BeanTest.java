package com.lesliefish;

public class BeanTest {
    private String message;

    public String getMessage() {
        System.out.println("message is " + message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init() {
        System.out.println("Bean is going through init.");
    }

    public void destroy() {
        System.out.println("Bean will destroy now.");
    }
}