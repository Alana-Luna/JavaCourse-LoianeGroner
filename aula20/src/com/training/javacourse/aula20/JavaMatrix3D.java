package com.training.javacourse.aula20;

public class JavaMatrix3D {

	public static void main(String[] args) {

		int[][][] matrix3D = new int[3][3][3];

		for (int i = 0; i < matrix3D.length; i++) {
			for (int j = 0; j < matrix3D[i].length; j++) {
				for (int k = 0; k < matrix3D[i][j].length; k++) {
					
					matrix3D[i][j][k] = i + j + k;
					
					System.out.print(matrix3D[i][j][k] + " - ");
				}
			}
			System.out.println();
		}

		int total = 0;
		int evenNumbers = 0;
		int oddNumbers = 0;
		
		for (int i = 0; i < matrix3D.length; i++) {
			for (int j = 0; j < matrix3D[i].length; j++) {
				for (int k = 0; k < matrix3D[i][j].length; k++) {

					total += matrix3D[i][j][k];

					if (matrix3D[i][j][k] % 2 == 0) {
						evenNumbers += matrix3D[i][j][k];
					} else {
						oddNumbers += matrix3D[i][j][k];
					}
				}
			}
		}

		System.out.println("Total amount = " + total);
		System.out.println("Amount of even numbers = " + evenNumbers);
		System.out.println("Amount of odd numbers = " + oddNumbers);
	}

}
