package com.training.javacourse.aula49;

public class FinallyTest {

	public static void main(String[] args) {

		int[] groupA = { 4, 8, 16, 32, 64, 128 };
		int[] groupB = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < groupA.length; i++) {
			
			try {
				System.out.println(groupA[i] + "/" + groupB[i] + " = " + (groupA[i] / groupB[i]));
			} catch (ArithmeticException e) {
				System.out.println("Error dividing by zero");
				//System.exit(0); //ends the application after the exception
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid array position");
				//System.exit(0); //ends the application after the exception
			} 

			finally {
				System.out.println("This line is always printed after try or catch");
			}
		}

	}

}
