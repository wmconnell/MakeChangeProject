package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("What is the price of the item?");
		double price = scanner.nextInt();
		
		System.out.println("How much money did the customer give you?");
		double payment = scanner.nextInt();
		
		calcPayment(price, payment);
		
		
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
		double change = price - payment;
		
		if (price < payment) {
			System.out.println("Change: " + change);
			if (change < bill20 && change > bill10) {
				
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
