package com.training.javacourse.aula41;


//An abstract class cannot be instantiated
//An abstract class needs to be extended 
public abstract class Person {

	private String name;
	private String telephone;
	private String address;

	public Person(String name, String address, String telephone) {
		super();
		this.name = name;
		this.address = address;
		this.telephone = telephone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	//Abstract methods cannot be implemented by the class, just for who extends
	public abstract String returnUserAddress();
}
