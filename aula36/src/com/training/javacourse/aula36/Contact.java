package com.training.javacourse.aula36;

public class Contact {

	private String name;
	private Address address; //one to one
	private Telephone[] telephones; //one to many
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Telephone[] getTelephones() {
		return telephones;
	}
	public void setTelephones(Telephone[] telephones) {
		this.telephones = telephones;
	}
	
	
}
