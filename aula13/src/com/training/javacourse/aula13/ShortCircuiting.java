package com.training.javacourse.aula13;

public class ShortCircuiting {

	public static void main(String[] args) {
	
		boolean trueSentence = true;
		boolean falseSentence = false;
		
		//there is a difference between simple & and double &
		//simple & reads "falseSentence & trueSentence" and them return the result
		//double & while read will find "falseSentence" and them return the result
		//debug to check, put breakpoints at line 15 and 17
		
		boolean result1 = falseSentence & 
				trueSentence;
		boolean result2 = falseSentence && 
				trueSentence;
		
		System.out.println(result1);
		System.out.println(result2);

	}

}
