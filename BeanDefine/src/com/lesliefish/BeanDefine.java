package com.lesliefish;

public class BeanDefine {
    private String message;

    private void init() {
        System.out.println("inti method");
    }

    public BeanDefine() {
    }

    public BeanDefine(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private void destroy() {
        System.out.println("inti method");
    }
}
