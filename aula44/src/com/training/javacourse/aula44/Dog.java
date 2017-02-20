package com.training.javacourse.aula44;

//Dog extends an abstract class but this abstract class also extends another abstract class
//So the ide will ask for Dog implement the methods of both classes
//Also dog implements two interfaces so will need implement its methods
public class Dog extends Mammal implements DomesticAnimal, DomesticatedAnimal{

	@Override
	public void toBreastfeed() {
		System.out.println("Puppies Nursing");
		
	}

	@Override
	public void makeSound() {
		System.out.println("Woof woof");
		
	}

	@Override
	public void takeToTheVet() {
		System.out.println("Going to the vet");
		
	}

	@Override
	public void feed() {
		System.out.println("Crunch crunch");
		
	}

	@Override
	public void play() {
		System.out.println("Awrf awrf");
		
	}

	@Override
	public void goForWalk() {
		System.out.println("Step step step");
		
	}

	
}
