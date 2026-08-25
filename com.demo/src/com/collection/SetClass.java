package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClass {

	public static void main(String[] args) {
		// Hash set
		HashSet<String> hs = new HashSet<>();
		hs.add("mango");
		hs.add("mulberry");
		hs.add("apple");
		hs.add("pineapple");
		hs.add("banana");
		hs.add(null);
		System.out.println(hs);
		
		// Linked hash set
		LinkedHashSet<String> ls = new LinkedHashSet<>();
		ls.add("mango");
		ls.add("mulberry");
		ls.add("apple");
		ls.add(null);
		ls.add("pineapple");
		ls.add("banana");
	//	ls.add(null);
		System.out.println(ls);
		
		// tree set 
		TreeSet<String> ts = new TreeSet<>();
		ts.add("mango");
		ts.add("mulberry");
		ts.add("apple");
		ts.add("pineapple");
		ts.add("banana");
  //    ts.add(null);
		System.out.println(ts);
		
		
		

	}

}
