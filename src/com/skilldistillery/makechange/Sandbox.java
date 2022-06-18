package com.skilldistillery.makechange;

import java.util.Scanner;

public class Sandbox {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("What is the price of the item?");
		double price = scanner.nextDouble();
		
		System.out.println("How much money did the customer give you?");
		double payment = scanner.nextDouble();
		
		calcPayment(price, payment);
		scanner.close();
	}

	private static void calcPayment(double price, double payment) {
		double bill20 = 20;
		double bill10 = 10;
		double bill5 = 5;
		double bill1 = 1;
		double coin25 = 0.25;
		double coin10 = 0.10;
		double coin05 = 0.05;
		double coin01 = 0.01;
		double change = (payment - price);
		int counter = 0;
		int counter20b = 0;
		int counter10b = 0;
		int counter5b = 0;
		int counter1b = 0;
		int counter25c = 0;
		int counter10c = 0;
		int counter05c = 0;
		int counter01c = 0;
		
		if (price < payment) {
			System.out.println("Change: $" + change);
			System.out.println(" ");
			System.out.println("Hand the customer: ");
			
			for (counter = 1; change > bill20; counter++) {
				change -= bill20;
			}
			System.out.println(counter + " $" +bill20 + "0s"); //testing
			for (counter = 1; change > bill10; counter++) {
				change -= bill10;
				System.out.println(counter + " $" +bill10 + "0s"); //testing
				
			}
		}
		else if (price > payment) {
			System.out.println("Insufficient payment.");
			System.out.println("Ask customer to provide an additional $" + change + ", or insist customer seek better-paying employment.");
		}
		else {
			System.out.println("Exact change provided. Thank you, come again!");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		}
	}
	
	
	
	
}