package com.pack;

public class Adress {
	String city;
	String state;
	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adress(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Adress [City=" + city + ", State=" + state + "]";
	}
	
	

}
