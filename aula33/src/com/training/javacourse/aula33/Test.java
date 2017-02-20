package com.training.javacourse.aula33;

public class Test {

	public static void main(String[] args) {

		MyCalculator calc = new MyCalculator();
		int[] myArray = {2,4,6};
		
		int resultA = calc.plus(1, 2);
		double resultB = calc.plus(1.0, 2.0);
		int resultC = calc.plus(1, 2, 3);
		int resultD = calc.plus(myArray);

		System.out.print(resultA + "\n" + resultB + "\n" + resultC + "\n" + resultD);
	}

}
