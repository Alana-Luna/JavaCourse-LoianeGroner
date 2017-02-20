package com.training.javacourse.aula12;

import java.util.Scanner;

public class ReadingDataFromKeyboard {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//nextLine() will take the full text. next() will only take the first word
		
		System.out.println("What's your name?");
		String name = scan.nextLine();
		
		System.out.println("Hi, " + name);
		
		System.out.println("How old are you?");
		int age = scan.nextInt();
		
		System.out.println("Your name is "+ name + " and you are " + age + " years old");

	}

}
