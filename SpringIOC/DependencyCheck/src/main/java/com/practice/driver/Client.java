package com.practice.driver;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.bean.Car;

public class Client {
	public static void main(String args[])
	{
		ApplicationContext factory=new ClassPathXmlApplicationContext("spring.xml");
		Car c= (Car) factory.getBean("c");
		c.printData();
		
		
	}
}
