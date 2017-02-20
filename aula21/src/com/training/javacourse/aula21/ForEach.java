package com.training.javacourse.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {

		//without for each
		System.out.print("*Example A*");
		
		int[] gradesSemester1 = new int[3];
		Random random = new Random();

		for (int i = 0; i < gradesSemester1.length; i++) {

			gradesSemester1[i] = random.nextInt(10);
		}

		for (int i = 0; i < gradesSemester1.length; i++) {
			
			int grade = gradesSemester1[i];
			System.out.print(" " + grade + "; ");
		}
		System.out.println();
		
		
		
		//using for each
		System.out.print("*Example B*");
		
		int[] gradesSemester2 = new int[10];

		for (int grade : gradesSemester2) {
			
			grade = random.nextInt(10);
			System.out.print(" " + grade + "; ");
		}
		
		System.out.println();
		
		
		//for each - multidimensional arrays
		System.out.print("*Example C*");
		
		
		double[][] studentsGrades = new double[3][2];

		studentsGrades[0][0] = 10;
		studentsGrades[0][1] = 7;
		
		studentsGrades[1][0] = 9;
		studentsGrades[1][1] = 8;
		
		studentsGrades[2][0] = 8;
		studentsGrades[2][1] = 9;
		
		for (double[] studentGrades : studentsGrades){
			for (double grade : studentGrades){
				System.out.print(" " + grade + "; ");
			}
		
}

	}

}
