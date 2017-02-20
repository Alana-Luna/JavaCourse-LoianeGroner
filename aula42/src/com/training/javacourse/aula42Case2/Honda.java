package com.training.javacourse.aula42Case2;

public class Honda extends Bike {

	// Compile Time Error, If you make any method as final, you cannot override it
	
	// void run() {
	// System.out.println("running safely with 100kmph");
	// }

	public static void main(String args[]) {
		Honda honda = new Honda();
		honda.run();
	}
}
