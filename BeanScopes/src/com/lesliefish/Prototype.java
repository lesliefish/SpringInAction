package com.lesliefish;

/**
 * 原型测试类 多个bean不同的对象
 */
public class Prototype {
    private String message;

    public String getMessage() {
        System.out.println("message is : " + message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
