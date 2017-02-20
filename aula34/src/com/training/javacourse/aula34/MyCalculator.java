package com.training.javacourse.aula34;

public class MyCalculator {

	public static int plus(int num1, int num2) {
		return num1 + num2;
	}

	public static double plus(double num1, double num2) {
		return num1 + num2;
	}

	public static int plus(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	public static int plus(int[] myArray) {

		int total = 0;

		for (int i = 0; i < myArray.length; i++) {
			total += myArray[i];
		}

		return total;
	}
}