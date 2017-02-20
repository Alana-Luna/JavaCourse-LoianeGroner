package com.training.javacourse.aula39;

import domestic.Dog;
import savage.Wolf;

public class Person {

	public static void main(String args[]) {

		Person p = new Person();
		p.throwBall();

	}

	// testing protected access modifier
	public void throwBall() {
		Wolf wolf = new Wolf();
		wolf.play();

	}

}
