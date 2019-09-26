package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.bean.CallingNumbers;
import com.example.bean.Helloworld;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext factory= new ClassPathXmlApplicationContext("spring.xml");
		/*Helloworld world= (Helloworld) factory.getBean("message");
		System.out.println("Hello world Methods");
		System.out.println(world.getFloatValue());
		System.out.println(world.getIntValue());*/
		System.out.println("Calling Numbers class methods");
		CallingNumbers call=(CallingNumbers) factory.getBean("numbers");
		System.out.println(call.getDoubleValue());
		System.out.println(call.getFloatValue());;
		System.out.println(call.getIntValue());;
		System.out.println(call.getLongValue());
		System.out.println(call.getList());
		System.out.println(call.getMap());

	}

}
