package com.collection;

import java.util.ArrayList;

public class StudentDetails {
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student (1, "gauu", "comp"));
		studentList.add(new Student(2,"riya", "ee"));
		studentList.add(new Student (3, "tina", "civil"));
		studentList.add(new Student (4, "siya", "mech"));
		
	    for(Student st : studentList) {
	    System.out.println(st.getRollNum());
	    System.out.println(st.getName());
	    System.out.println(st.getBranch());
	
	 
	}

}
}