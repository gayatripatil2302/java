package com.keywordAndDatatype;

public class Employee {

	String Emp_name = "gayatri";
	int Emp_id = 101;
	static String company_name = "abc";
	
	void empDetails() {
	
	int studentAge = 45;
	
	System.out.println("employee name :" +Emp_name);
	System.out.println("employee id :" +Emp_id);
	System.out.println("company name :" +company_name);
	}

	public static void main(String[] args) {	
	Employee employee = new Employee();
	employee.empDetails();
	}
}
