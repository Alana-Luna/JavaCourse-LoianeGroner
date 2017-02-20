package com.training.javacourse.aula38;

public class Dog extends Animal {

	//super() can be used to invoke immediate parent class constructor
	Dog() {
		super();
		System.out.println("dog is created");
	}

	String color = "black";

	//super can be used to refer immediate parent class instance variable
	void printColor() {
		System.out.println(color); // prints color of Dog class
		System.out.println(super.color); // prints color of Animal class
	}

	void eat() {
		System.out.println("eating bread...");
	}

	void bark() {
		System.out.println("barking...");
	}

	// super can be used to invoke immediate parent class method
	void work() {
		super.eat();
		bark();
	}

}
