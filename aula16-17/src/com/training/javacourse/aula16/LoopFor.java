package com.training.javacourse.aula16;

public class LoopFor {

	public static void main(String[] args) {

		System.out.println("**Example 1:");
		for (int a = 1; a <= 5; a++) {

			System.out.println(a);
		}

		System.out.println("**Example 2:");
		for (int b = 5; b > 0; b--) {

			System.out.println(b);
		}
		
		System.out.println("**Example 3: ");
		for (int x = 0, y = 6; x < y; x++, y--) {

			System.out.println("The value of X is: " + x + ". The value of Y is: " + y);
		}
		
		System.out.println("**Example 4: ");
		
		int totalX = 0;
		
		for (int x = 1; x < 5; totalX += ++x) {

			System.out.println("The total amount is: " + totalX);
			System.out.println(x);
				
		}
		
		System.out.println("**Example 5: ");
		
		int totalY = 0;
		for (int x = 1; x < 5; totalY += x++) {

			System.out.println("The total amount is: " + totalY);
			System.out.println(x);
			
			
		}

	}

}
