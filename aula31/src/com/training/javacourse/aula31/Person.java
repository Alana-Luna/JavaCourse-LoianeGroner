package com.training.javacourse.aula31;

import domestic.Dog;

public class Person {

	public static void main(String args[]) {

		Person p = new Person();
		p.teach();
		p.askForWave();
	}

	// testing public access modifier
	public void teach() {
		Dog dog = new Dog();
		dog.bark();
	}

	
	// testing private access modifier
	 public void askForWave() {
	 Dog dog = new Dog();
	 //dog.waveTail(); // Compile error because waveTail() is not visible
	 }

}
