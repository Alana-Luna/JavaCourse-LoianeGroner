package com.training.javacourse.aula35;

public class Factorial {

    public static int factorial(int num){
		
		if (num == 0){
			return 1;
		}
	
		return num * factorial(num-1);
}
}
