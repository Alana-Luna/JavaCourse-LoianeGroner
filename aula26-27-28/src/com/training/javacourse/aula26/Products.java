package com.training.javacourse.aula26;

public class Products {

	double milkPrice = 1.36;
	double sodaPrice = 5;
	double coffeePrice = 8;

	double total;
	double product;

	double calculateAmount(int option, int amount) {

		switch (option) {

		case 1:
			product = milkPrice;
			break;

		case 2:
			product = sodaPrice;
			break;

		case 3:
			product = coffeePrice;
			break;

		default:
			System.out.println("Incorrect option!");
		}

		total = product * amount;

		return total;

	}

}
