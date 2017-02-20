package com.training.javacourse.aula48;

public class MultiplesCatch {

	public static void main(String[] args) {
		
		int[] groupA = { 4, 8, 16, 32, 64, 128 };
		int[] groupB = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < groupA.length; i++) {
			try {
				System.out.println(groupA[i] + "/" + groupB[i] + " = " + (groupA[i] / groupB[i]));
			} catch (ArithmeticException e) {
				System.out.println("Error dividing by zero");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid array position");
			} catch (Throwable e) {
				System.out.println("Capturing any exception");
			}
		}
	}

}
