package com.training.javacourse.aula20;

public class JavaMatrix2D {

	public static void main(String[] args) {
		
		double[][] grades = new double[3][2];
		
		grades[0][0] = 8;
		grades[0][1] = 6.5;
		
		grades[1][0] = 10;
		grades[1][1] = 8.5;
		
		grades[2][0] = 5.3;
		grades[2][1] = 7.2;
		
	
		//grades.length = 3
		for(int i = 0; i < grades.length; i++){
			
			//grades[i].length = 2
			for(int j = 0; j < grades[i].length; j++){
				
				System.out.print(grades[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		

	}

}
