package com.muchen.service;

/**
 * @author 沐辰1012
 */
public class HelloService {
    private String hello;

    public HelloService() {
    }

    public HelloService(String hello) {
        this.hello = hello;
    }

    public void hello(){
        System.out.println(hello);
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public String getHello() {
        return hello;
    }
}
