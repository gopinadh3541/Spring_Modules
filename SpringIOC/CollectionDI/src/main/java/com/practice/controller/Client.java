package com.practice.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.beans.Test;

public class Client {
	public static void main(String[] args)
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Test t= (Test) context.getBean("t");
		t.printData();
		
	}
}
