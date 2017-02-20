package com.training.javacourse.aula52;

public class DivisionIsNotExact extends Exception {

	private int numY;
	private int numX;
	
	public DivisionIsNotExact(int numY, int numX) {
		super();
		this.numY = numY;
		this.numX = numX;
	}
	
	@Override
	public String toString() {
		return "The division " + numY + "/" + numX + " is not exact!";
}
	
}
