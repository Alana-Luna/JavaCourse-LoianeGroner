package com.training.javacourse.aula36;

public class Test {

	public static void main(String[] args) {

		//testing "one to one" and "one to many" relation
		
		Address a = new Address();

		a.setStreet("University Street");
		a.setNumber("2847");
		a.setCity("Seattle");
		a.setZipCode("98155");

		Telephone t1 = new Telephone();

		t1.setAreaCode("206");
		t1.setNumber("3651375");

		Telephone t2 = new Telephone();

		t2.setAreaCode("206");
		t2.setNumber("5302614");

		Telephone[] telephones = new Telephone[2];
		telephones[0] = t1;
		telephones[1] = t2;

		Contact c = new Contact();
		c.setName("Camila");
		c.setAddress(a);
		c.setTelephones(telephones);

		System.out.println("Hello, " + c.getName());
		System.out.println("Your address is: " + c.getAddress().getStreet());
		
		for (Telephone t : c.getTelephones()) {
			System.out.println("Your telephone: "+ t.getAreaCode() + " " + t.getNumber());
		}
	}

}
