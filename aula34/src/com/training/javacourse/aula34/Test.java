package com.training.javacourse.aula34;

public class Test {

	public static void main(String[] args) {
		
		//Static methods can be called without an instance of the object
		int result = MyCalculator.plus(1, 2);
		
		
		print(result);

	}
	
	public static void print(int total) {
		
		System.out.println(total);
	}

}
