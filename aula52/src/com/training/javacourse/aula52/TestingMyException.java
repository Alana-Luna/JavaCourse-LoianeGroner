package com.training.javacourse.aula52;

public class TestingMyException {

	public static void main(String[] args) {

		try {
			test();
		} catch (DivisionIsNotExact e) {
			e.printStackTrace();
		}
	}
	
	public static void test() throws DivisionIsNotExact {
		int[] groupA = { 4, 8, 16, 32, 64, 128 };
		int[] groupB = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < groupA.length; i++) {
			try {
				if (groupA[i] % 2 != 0) {
					// throw exception here
					throw new DivisionIsNotExact(groupA[i], groupB[i]);
				}
				System.out.println(groupA[i] + "/" + groupB[i] + " = " + (groupA[i] / groupB[i]));
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("An error occurred");
				e.printStackTrace();
			}
		}
	}
}
		

