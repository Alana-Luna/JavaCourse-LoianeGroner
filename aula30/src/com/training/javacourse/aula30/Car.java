package com.training.javacourse.aula30;

public class Car {

	String brand;
	String color;
	int numOfPassengers;

	// Using the keyword "this" - example 1
	Car(String brand, String color, int numOfPassengers) {

		System.out.println("Initializing our system...");

		this.brand = brand;
		this.color = color;
		this.numOfPassengers = numOfPassengers;

		System.out.println("the brand of your car is " + brand);
	}
	
	
	// Using the keyword "this" - example 2
	Car(String brand, String color){
		
		this.brand = brand;
		this.color = color;
		this.numOfPassengers = 10;
	}
}
