package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServerHandler {

    private List<String> list;

    @Value("${jaj-mucus-hajjaj}")
    private String someString;

    @Value("${random}")
    private String someLong;

    public ServerHandler() {}

    @Autowired
    public ServerHandler(@Qualifier("someOtherList") List<String> list) {
        this.list = list;
    }

    public void doSomething() {
        System.out.println("I did something!");
    }

    public void upload() {
        System.out.println(list.size());
        System.out.println("***");
        try {
            long s = Integer.parseInt(someLong);
            System.out.println("num " + s);
        } catch (Exception e) {
            System.out.println(someLong);
        }
    }

}
