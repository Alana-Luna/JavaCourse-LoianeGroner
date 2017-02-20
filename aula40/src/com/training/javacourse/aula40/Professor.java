package com.training.javacourse.aula40;

public class Professor extends Person{

	
	public Professor(String name, String address, String telephone) {
		super(name, address, telephone);
		
	}

	private double salary;
	private String department;
	
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	//polymorphism
	public String returnUserAddress() {

		String s = "Professor Address: ";
		s += super.getAddress();

		return s;
	}
}
