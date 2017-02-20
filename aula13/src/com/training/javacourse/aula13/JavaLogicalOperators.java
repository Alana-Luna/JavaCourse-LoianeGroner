package com.training.javacourse.aula13;

public class JavaLogicalOperators {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		boolean result1 = (a == 1) && (b == 2);
		
		System.out.println("\"a\" is 1 AND \"b\" is 2. Result:" + result1);
		
		boolean result2 = (a == 1) || (b == 2);
		
		System.out.println("\"a\" is 1 OR \"b\" is 2. Result:" + result2);
		
		boolean trueSentence = true;
		boolean falseSentence = false;
		
		//false: because at least one is false
		System.out.println(trueSentence && falseSentence);
		
		//true: because at least one is true
		System.out.println(trueSentence || falseSentence);
		
		//true: because to be false, both should have the same value
		System.out.println(trueSentence ^ falseSentence);
		
		//false: because the trueSentence is being denied
		System.out.println(!trueSentence && falseSentence);
		

	}

}
