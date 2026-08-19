package com.collection;

import java.util.ArrayList;

public class BooksDetails {
	public static void main(String[] args) {
		ArrayList<Books> bk =  new ArrayList<>();
		bk.add(new Books(1,"chhava","shivaji sawant"));
		bk.add(new Books(2,"shriman yogi","ranjit desai"));
		bk.add(new Books(3,"mrutunjay","shivaji sawant"));
		bk.add(new Books(4,"yayati","v.s.khandekar"));
		
		for(Books a:bk) {
			System.out.println(a.getBookID());
			System.out.println(a.getBooName());
			System.out.println(a.getAuthor());
			System.out.println();
		}
		
	}

}
