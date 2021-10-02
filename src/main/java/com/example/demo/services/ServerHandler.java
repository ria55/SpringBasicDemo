package com.example.demo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServerHandler {

    @Value("${my.random.string}")
    private String someString;

    @Value("${random}")
    private String someLong;

    public ServerHandler() {}

    public void doSomething() {
        System.out.println("I did something!");
    }

    public void upload() {
        System.out.println(someString);
        System.out.println("***");
        try {
            long s = Integer.parseInt(someLong);
            System.out.println("num " + s);
        } catch (Exception e) {
            System.out.println(someLong);
        }
    }

}
