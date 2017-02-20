package com.training.javacourse.aula33;

public class MyCalculator {

	
	//Overload: methods with the same name but with different signature
	//(return type, quantity and type of parameters)
	
	public int plus(int num1, int num2){
		return num1 + num2;
	}
	
	public double plus(double num1, double num2){
		return num1 + num2;
	}
	
	public int plus(int num1, int num2, int num3){
		return num1 + num2 + num3;
	}
	
	public int plus(int[] myArray){
		
		int total = 0;
		
		for (int i=0; i<myArray.length; i++){
			total += myArray[i];
		}
		
		return total;
}
}
