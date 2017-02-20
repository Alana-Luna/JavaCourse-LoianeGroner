package com.training.javacourse.aula37;

public class Test {

	public static void main(String[] args) {
		
		//let's test java inheritance
		
		double[] grades = new double[2];
		grades[0] = 7.75;
		grades[1] = 8.10;
		
		//here we can access attributes of the "Student" class and also  of the "Person" class
		//because the "Student" class is a daughter of the "Person" class
		Student student = new Student();
		student.setName("Caleb");
		student.setEmail("caleb123@email.com");
		student.setTelephone("2025550148");
		student.setCourse("Electrical engineering");
		student.setGrades(grades);
		
		//the "Professor" class is also a daughter of the "Person" class
		//but in this case we can only access attributes of Person
		//because the Professor object is inside a Person (indirect casting)
		Person teacher = new Professor();
		teacher.setName("Phillip");
		teacher.setEmail("theprofessor@email.com");
		teacher.setTelephone("2025550183");

		System.out.println(student.getName() + ", " + student.getCourse() + " - Professor: " +teacher.getName());
		
	}

}
