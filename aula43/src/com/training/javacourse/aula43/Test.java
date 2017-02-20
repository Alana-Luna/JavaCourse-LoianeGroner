package com.training.javacourse.aula43;

public class Test {

	public static void main(String[] args) {

		Student s1 = new Student("Yelena", "Glasgow");
		Student s2 = new Student("Juanita", "Liverpool");

		//If you print any object, java compiler internally invokes the toString() method on the object
		//So overriding the toString() method, returns the desired output
		System.out.println(s1);
		System.out.println(s2);
		
		//The equals() method returns True if the argument:
		//is not null and is an object of the same type and with the same value
		System.out.println(s1.equals(s2));
		
		
	}

}
