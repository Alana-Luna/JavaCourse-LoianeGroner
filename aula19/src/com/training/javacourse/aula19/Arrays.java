package com.training.javacourse.aula19;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		// example 1
		String fruits[] = { "Apple", "Banana", "Grape", "Lemon" };

		for (int f = 0; f < fruits.length; f++) {

			if (f != 3) {
				System.out.print(fruits[f] + ", ");
			} else {
				System.out.print(fruits[f] + ".");
			}

		}

		System.out.print("\n");

		// example 2
		String[] vegetables = { "Broccoli", "Carrots", "Lettuce", "Potato" };

		for (int v = 0; v < vegetables.length; v++) {

			if (v != 3) {
				System.out.print(vegetables[v] + ", ");
			} else {
				System.out.print(vegetables[v] + ".");
			}

		}

		System.out.print("\n");

		// example 3
		String[] candies = new String[4];
		candies[0] = "Chocolate";
		candies[1] = "Caramel";
		candies[2] = "Hershey Bar";
		candies[3] = "Twix";

		for (int c = 0; c < candies.length; c++) {

			if (c != 3) {
				System.out.print(candies[c] + ", ");
			} else {
				System.out.print(candies[c] + ".");
			}

		}

		System.out.print("\n");

		// example 4

		String[] products = new String[4];
		Scanner scan = new Scanner(System.in);

		for (int p = 0; p < products.length; p++) {

			System.out.println("Input a product: ");
			String product = scan.nextLine();

			products[p] = product;
		}

		for (int p = 0; p < products.length; p++) {

			if (p != 3) {
				System.out.print(products[p] + ", ");
			} else {
				System.out.print(products[p] + ".");
			}

		}
		
		System.out.print("\n");
		
		// example 5
		
		for(String x : products){
			System.out.println(x);
		}

	}

}
