package com.training.javacourse.aula18;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input a number: ");
		int number = scan.nextInt();
		
		System.out.println("Now you define a limit: ");
		int limit = scan.nextInt();
		
		for(int i = number; i <= limit; i++){
			
			if(i%7 == 0){
				System.out.println("The variable i: " + i);
				break; //to get out of loop
			}
			
		}

	}

}
