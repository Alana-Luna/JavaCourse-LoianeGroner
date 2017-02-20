package com.training.javacourse.aula47;

public class Exception {

	public static void main(String[] args) {

		try {
			int[] array = new int[4];

			System.out.println("Before exception");
			array[4] = 1; //will generate exception
			System.out.println("This text will not be printed");
		} 
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exception when accessing an index that does not exist");
		}

		System.out.println("This text will be printed after exception");
	}

}
