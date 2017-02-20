package com.training.javacourse.aula41;

public class Test {

	public static void main(String[] args) {
		
		
		//Person cannot be instantiated because is an abstract class 
		//Person person = new Person("Liam","80 Delancey St","2025550183");
		
		//here student and professor are instantiated inside a Person 
		Person student = new Student("Shane","205 Stewart Ave","2025558490");
		Person professor = new Professor("Taylor","475 N Broadway","2025557621");
	 
		
		//it was detected that the method returnUserAddress() from Person is abstract 
		//so it will be interpreted to run returnUserAddress() from student and professor classes
		System.out.println(student.returnUserAddress());
		System.out.println(professor.returnUserAddress());
				

	}

}
