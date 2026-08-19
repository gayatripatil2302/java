package com.collection;

public class Student {
	private int rollNum;
	private String name;
	private String branch;
	
	 public Student() {
	 super();
	 }

	 public Student(int rollNum, String name, String branch) {
		 this.rollNum = rollNum;
		 this.name = name;
		 this.branch = branch;
	 }
	 
	 public int getRollNum() {
		 return rollNum;
	 }

	 public void setRollNum(int rollNum) {
		 this.rollNum = rollNum;
	 }

	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }

	 public String getBranch() {
		 return branch;
	 }

	 public void setBranch(String branch) {
		 this.branch = branch;
	 }
}
