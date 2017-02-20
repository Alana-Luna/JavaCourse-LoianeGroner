package com.training.javacourse.aula43;

public class Student {

	String name;
	String city;

	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	//The toString() method returns the string representation of the object
	public String toString() {
		return name + " from " + city;
	}


	//The method equals determines if the object that invokes the method 
	//is equal to the object that is passed as an argument
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
