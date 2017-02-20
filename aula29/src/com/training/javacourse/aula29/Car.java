package com.training.javacourse.aula29;

public class Car {

	// attributes

	String brand;
	String color;
	int numOfPassengers;
	
	Car(String brand, String color, int numOfPassengers){
		
		System.out.println("Initializing our system...");
		brand = brand;
		color = color;
		numOfPassengers = numOfPassengers;
		
		System.out.println("the brand of your car is " + brand);
	}

}
