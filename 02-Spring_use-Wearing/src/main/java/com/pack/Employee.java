package com.pack;

public class Employee {
	protected int id;
	protected String name;
	protected Adress adress;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, Adress adress) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", adress=" + adress + "]";
	}
	
	
	
}
