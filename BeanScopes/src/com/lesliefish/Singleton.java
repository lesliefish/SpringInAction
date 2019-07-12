package com.lesliefish;

/**
 * bean测试 单例
 */
public class Singleton {
    private String message;

    public String getMessage() {
        System.out.println("message is : " + message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
