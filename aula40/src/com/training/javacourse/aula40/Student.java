package com.training.javacourse.aula40;

public class Student extends Person {

	
	public Student(String name, String address, String telephone) {
		super(name, address, telephone);
		
	}

	private String course;
	private double[] grades;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double[] getGrades() {
		return grades;
	}

	public void setGrades(double[] grades) {
		this.grades = grades;
	}

	//polymorphism
	public String returnUserAddress() {

		String s = "Student Address: ";
		s += super.getAddress();

		return s;
	}
}
