package com.practice.bean;

import org.springframework.beans.factory.annotation.Required;

public class Car {

	private String carName;
	private Engine engine;
	public String getCarName() {
		return carName;
	}
	@Required
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Engine getEngine() {
		return engine;
	}
	@Required
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void printData()
	{
		System.out.println(carName);
		System.out.println(engine.getYear());
	}
	
}
