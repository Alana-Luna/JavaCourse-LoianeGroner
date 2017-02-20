package com.training.javacourse.aula50;

public class GenericException {

	public static void main(String[] args) {

		int[] groupA = { 4, 8, 16, 32, 64, 128 };
		int[] groupB = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < groupA.length; i++) {

			try {
				System.out.println(groupA[i] + "/" + groupB[i] + " = " + (groupA[i] / groupB[i]));
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

		}

	}

}
