package com.example.demo;

import com.example.demo.services.ServerHandler;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	private static ServerHandler handler;

	private static List<String> list;

	@Autowired
	public DemoApplication(ServerHandler handler, @Qualifier("someStringList") List<String> list) {
		DemoApplication.handler = handler;
		DemoApplication.list = list;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		handler.upload();
		System.out.println();
		System.out.println(list);
	}

}
