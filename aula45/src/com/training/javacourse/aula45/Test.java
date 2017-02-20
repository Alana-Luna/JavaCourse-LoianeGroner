package com.training.javacourse.aula45;

public class Test {

	public static void main(String[] args) {
		
		//casting:
		//you tell the program that you know what the runtime type of the object really is
		//the program will do the conversion
		//but will still do a sanity check to make sure that it's possible
		

		//Up-casting is casting to a supertype (student to person)
		//you can also Person p = new Student("x","y","z");
		Student student01 = new Student("Minho","205 Stewart Ave","2025558490");
		Person person01 = (Person) student01; //can be also written as Person person01 = student01;
		System.out.println(person01.returnUserAddress());
		
		if(person01 instanceof Student) {
			System.out.println("This person is a student");
		}
		else {
			System.out.println("This person is not a student");
		}
		
		//downcasting is casting to a subtype (person to student)
		//compile error: Student s = new Person("x","y","z");
		//compile error: Student student02 = person02;
		// Person person02 = new Person("Key","422 Prince Ave","2025559874");
		// Student student02 = (Student) person02;
		// System.out.println(student02.returnUserAddress());
		//runtime exception: person can't cast to student 
		//reason: student is different (course and grade attributes)
		
	}

}
