package com.training.javacourse.aula44;

public abstract class Animal {

	private String name;
	
	public abstract void makeSound();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
