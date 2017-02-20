package com.training.javacourse.aula42Case3;

//Compile Time Error, If you make any class as final, you cannot extend it
//public class Honda extends Bike{	
public class Honda {
	
	void run() {
		System.out.println("running safely with 100kmph");
	}

	public static void main(String args[]) {
		Honda honda = new Honda();
		honda.run();
	}
}