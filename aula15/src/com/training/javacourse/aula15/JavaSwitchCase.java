package com.training.javacourse.aula15;

import java.util.Scanner;

public class JavaSwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert the day of the week: ");
		
		int dayOfTheWeek = scan.nextInt();
		
		switch (dayOfTheWeek){
			
		case 1: 
			System.out.println("Sunday");
			break;
		
		case 2: 
			System.out.println("Monday");
			break;
		
		case 3: 
			System.out.println("Tuesday");
			break;
		
		
		case 4: 
			System.out.println("Wednesday");
			break;
		
		case 5: 
			System.out.println("Thursday");
			break;
		
		case 6: 
			System.out.println("Friday");
			break;
		
		case 7: 
			System.out.println("Saturday");
			break;
		
		default: System.out.println("Is not a valid day");
		}

	}

}
