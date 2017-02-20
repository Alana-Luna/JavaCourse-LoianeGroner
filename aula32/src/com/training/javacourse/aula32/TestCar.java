package com.training.javacourse.aula32;

import java.util.Scanner;

public class TestCar {

	public static void main(String[] args) {

		
		System.out.println("***Example 1***");
		
		Car car = new Car();
		car.setBrand("Nissan");
		car.setColor("Silver");
		car.setNumOfPassengers(4);

		System.out.println("Your car: " + car.getBrand() + ", " + car.getColor() + ", " + car.getNumOfPassengers());

		
	
		System.out.println("***Example 2***");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type the brand of your car: ");
		String brand = input.nextLine();
		
		System.out.println("Type the color: ");
		String color = input.nextLine();
		
		System.out.println("Type the number of passengers of your car: ");
		int num = input.nextInt();
		
		Car car2 = new Car();
		car2.setBrand(brand);
		car2.setColor(color);
		car2.setNumOfPassengers(num);
		
		System.out.println("Your car: " + car2.getBrand() + ", " + car2.getColor() + ", " + car2.getNumOfPassengers());

		
		
	}

}
