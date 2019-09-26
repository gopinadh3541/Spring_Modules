package com.practice.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test {
	
	private List<String> fruits;
	private Set<String> cricketers;
	private Map<String, String> capitals;
	private Properties properties;
	private Properties actors;
	
	public Properties getActors() {
		return actors;
	}
	public void setActors(Properties actors) {
		this.actors = actors;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public Map<String, String> getCapitals() {
		return capitals;
	}
	public void setCapitals(Map<String, String> capitals) {
		this.capitals = capitals;
	}
	public List<String> getFruits() {
		return fruits;
	}
	public void setFruits(List<String> fruits) {
		this.fruits = fruits;
	}
	public Set<String> getCricketers() {
		return cricketers;
	}
	public void setCricketers(Set<String> cricketers) {
		this.cricketers = cricketers;
	}
	
	public void printData()
	{
		Properties prop=new Properties();
		System.out.println("Fruits-----------");
		for(Object list: fruits)
		{
			System.out.println(list);
		}
		System.out.println("Cricketers");
		for(Object set: cricketers)
		{
			System.out.println(set);
		}
		System.out.println("Country and capitals");
		System.out.println(capitals);
		System.out.println("****************Properties****************");
		Set<Object> set=properties.keySet();
		for(Object s:set)
		{
			System.out.println(properties.getProperty(s.toString()));
		}
		Set<Object> newSet=actors.keySet();
		System.out.println("Actors--------------**************");
		for(Object n: newSet)
		{
			System.out.println(actors.getProperty(n.toString()));
		}
	}
	

}
