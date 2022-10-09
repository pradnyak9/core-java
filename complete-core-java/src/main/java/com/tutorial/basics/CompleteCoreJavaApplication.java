package com.tutorial.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tutorial.domain.Hello;

@SpringBootApplication
public class CompleteCoreJavaApplication {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		SpringApplication.run(CompleteCoreJavaApplication.class, args);
		Hello hello = new Hello("Pradnya");
		hello.setName("PradnyaK");
		System.out.println("Hello "+hello.getName()+", Welcome to gitpod!");
	}

}
