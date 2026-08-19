package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExmpl {
	public static void main(String[] args) {
		
		ArrayList<String> studentList = new ArrayList<>(); 
		studentList.add("gayatri");
		studentList.add("rohit");
		studentList.add("sarthak");
		studentList.add("prachi");
		studentList.add("riyaa");
		studentList.add("rahul");
		
		System.out.println("student list with enhanced for loop ");
		// enhanced for loop 
		for (String a : studentList) {
			System.out.println(a);
			
//		// for loop 
//			System.out.println("student list with for loop ");
//			for (int i =0; i<studentList.size();i++) {
//			System.out.println(studentList.get(i));
//			}
//			
		// with iterator 
			System.out.println("student list with  Iterator");
			Iterator <String> itr = studentList.iterator();
			while(itr.hasNext()) {
				String i = itr.next(); // i++
				System.out.println(i);
			}
		}		
	}
}



