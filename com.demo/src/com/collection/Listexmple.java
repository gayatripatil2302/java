package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Listexmple {

	public static void main(String[] args) {
		ArrayList<Integer> emp_num = new ArrayList<>();
		emp_num.add(101);
		emp_num.add(102);
		emp_num.add(103);
		emp_num.add(105);
		
//		System.out.println("list with enhanced for loop");
//		for (Integer a : emp_num) {
//			System.out.println(a);
//		}
		
//		System.out.println("list with  for loop");
//		for (int i = 0; i< emp_num.size();i++ ) {
//			System.out.println(emp_num.get(i));
//		}
		
		System.out.println("list with iterator");
		Iterator <Integer> itr = emp_num.iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i);
		
			
		}
		
	

	}

}
