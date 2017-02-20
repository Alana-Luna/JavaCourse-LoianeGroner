package com.training.javacourse.aula24;

public class CarTest {

	public static void main(String[] args) {
		
		//objects
		
		Car Duster = new Car();
		Car Corolla = new Car();
		
		Duster.brand = "Renault";
		Duster.color = "black";
		Duster.numOfPassengers = 4;
		
		Corolla.brand = "Toyota";
		Corolla.color = "grey";
		Corolla.numOfPassengers = 4;
		
		System.out.println(Duster.brand);
		System.out.println(Corolla.brand);

	}

}
