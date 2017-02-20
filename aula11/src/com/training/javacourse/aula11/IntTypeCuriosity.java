package com.training.javacourse.aula11;

public class IntTypeCuriosity {

	public static void main(String[] args) {
		
		// minimum value for int: -2147483648 
		// maximum value for int: 2147483647
		
		int var1 = 2147483647;
		int var2 = 1;
		
		//After exceeding the limit, the sum returns the minimum value accepted 
		System.out.println(var1 + var2);

	}

}
