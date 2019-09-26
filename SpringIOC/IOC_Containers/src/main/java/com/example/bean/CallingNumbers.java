package com.example.bean;

import java.util.List;
import java.util.Map;

public class CallingNumbers {
	
	int intValue;
	float floatValue;
	double doubleValue;
	long longValue;
	List<String> list;
	Map<String,String> map;
	public Map<String, String> getMap() {
		return map;
	}



	public void setMap(Map<String, String> map) {
		this.map = map;
	}



	CallingNumbers(int intValue,float floatValue, double doubleValue, long longValue)
	{
		this.intValue=intValue;
		this.doubleValue=doubleValue;
		this.floatValue=floatValue;
 		this.longValue=longValue;
	}
	
	
	
	public List<String> getList() {
		return list;
	}



	public void setList(List<String> list) {
		this.list = list;
	}



	public int getIntValue() {
		return intValue;
	}
	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	public float getFloatValue() {
		return floatValue;
	}
	public void setFloatValue(float floatValue) {
		this.floatValue = floatValue;
	}
	public double getDoubleValue() {
		return doubleValue;
	}
	public void setDoubleValue(double doubleValue) {
		this.doubleValue = doubleValue;
	}
	public long getLongValue() {
		return longValue;
	}
	public void setLongValue(long longValue) {
		this.longValue = longValue;
	}

	
}
