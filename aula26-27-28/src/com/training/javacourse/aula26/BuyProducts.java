package com.training.javacourse.aula26;

import java.util.Scanner;

public class BuyProducts {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int product = 0;
		double total = 0;
		
		while(product != 9){
			
			System.out.println("Please, choose a product: 1-Milk | 2-Soda | 3-Coffee | 9-To finish");
			product = input.nextInt();
			
			if(product == 9){
				System.out.println("Goodbye!");
				break;
			}
			
			System.out.println("Please, input the amount of your product");
			int amount = input.nextInt();
			
			Products myShopping = new Products();
			total += myShopping.calculateAmount(product, amount);
			
			System.out.println("You will pay " + total);
		}
		
		
		
		

	}

}
