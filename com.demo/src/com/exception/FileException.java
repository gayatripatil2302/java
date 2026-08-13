package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//Write a Java program that attempts to open a non-existent file and identify the checked exception generated.
public class FileException {
	public static void main(String[] args) {
		try {
			File file = new File ("git.txt");
			FileReader filereader = new FileReader(file);
			System.out.println("file open ");
		}
		catch(FileNotFoundException e ) {
		System.out.println("file not found");
			
		}
	}

}
