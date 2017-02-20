package com.training.javacourse.aula14;

import java.util.Scanner;

public class JavaIfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("How much it will cost?");
		double price = scan.nextDouble();
		
		if(price <= 10){
			System.out.println("It's cheap");
		}
		else if (10 < price && price < 15){
			System.out.println("Ask for discount");
		}
		else if(price > 15){
			System.out.println("It's expensive");
		}

	}

}
