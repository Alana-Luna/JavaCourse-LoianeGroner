package com.training.javacourse.aula46;

//Java does not offer multiple inheritance between classes 
//but it is possible to apply multiple inheritance between interfaces
public interface Database extends SqlDCL, SqlDDL, SqlDML {

	void openConnection();

	void closeConnection();
}
