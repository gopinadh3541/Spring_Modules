<<<<<<< HEAD
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
=======
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
>>>>>>> f6de2485f28d36154a928fc5b4db92b12e481e8b
