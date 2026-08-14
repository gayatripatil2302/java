package com.exception;

public class BankManagement {
	
		   static double balance = 5000;

		    static void deposit(int amount) {
		        balance = balance + amount;
		        System.out.println("Amount deposited: " + amount);
		        System.out.println("Current balance: " + balance);
		    }

		    static void withdraw(int amount) {

		        if (amount <= 0) {
		            throw new IllegalArgumentException(
		                    "Withdrawal amount must be greater than zero");
		        }

		        if (amount > balance) {
		            throw new IllegalArgumentException(
		                    "Insufficient balance");
		        }

		        balance = balance - amount;

		        System.out.println("Amount withdrawn: " + amount);
		        System.out.println("Current balance: " + balance);
		    }

		    public static void main(String[] args) {

		        try {
		            System.out.println("Bank transaction started");

		            deposit(2000);

		            withdraw(3000);

		            // Invalid withdrawal
		            withdraw(5000);

		        } catch (IllegalArgumentException e) {

		            System.out.println("Error: " + e.getMessage());

		        } finally {

		            System.out.println("Transaction completed");
		            System.out.println("Final balance: " + balance);
		        }
		    }
		}