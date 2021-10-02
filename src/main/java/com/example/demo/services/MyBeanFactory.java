package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyBeanFactory {

    private ServerHandler handler;

    @Autowired
    public MyBeanFactory(ServerHandler handler) {
        this.handler = handler;
    }

    @Bean
    public List<String> someStringList() {
        List<String> list = new ArrayList<>();
        list.add("kiscica");
        list.add("kiskutya");
        list.add("zsiráf");

        return list;
    }

    @Bean
    public List<String> someOtherList() {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("zsiráf");

        return list;
    }

}
