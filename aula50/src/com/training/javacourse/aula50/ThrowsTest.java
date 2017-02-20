package com.training.javacourse.aula50;

import java.util.Scanner;

public class ThrowsTest {

	public static void main(String[] args) {

		System.out.println("Input a number");
		try {
			double num = readNumber();
			System.out.println("You typed " + num);
		} catch (Exception e) {
			System.out.println("Invalid input");
			e.printStackTrace();
		}

	}

	public static double readNumber() throws Exception {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}

}
