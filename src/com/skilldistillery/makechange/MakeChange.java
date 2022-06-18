package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

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
		
		if (price < payment) {
			System.out.println("Change: $" + change);
			System.out.println(" ");
			System.out.println("Hand the customer: ");
			while (change > 0) {
				if (change > bill20) {
					int counter = 1;
					change -= bill20;
					System.out.println(counter + " $" +bill20 + "0s"); //testing
					counter++;
					continue;
				}
				else if (change > bill10) {
					int counter = 1;
					change -= bill10;
					System.out.println(counter + " $" +bill10 + "0s"); //testing
					counter++;
					continue;
				}
				else if (change > bill5) {
					int counter = 1;
					change -= bill5;
					System.out.println(counter + " $" +bill5 + "0s"); //testing
					counter++;
					continue;
				}
				else if (change > bill1) {
					int counter = 1;
					change -=  bill1;
					System.out.println(counter + " $" +bill1 + "0s"); //testing
					counter++;
					continue;
				}
				else if (change > coin25) {
					int counter = 1;
					change -=  coin25;
					System.out.println(counter + " quarters"); //testing
					counter++;
					continue;
				}
				else if (change > coin10) {
					int counter = 1;
					change -= coin10;
					System.out.println(counter + " dimes"); //testing
					counter++;
					continue;
				}
				else if (change > coin05) {
					int counter = 1;
					change -= coin05;
					System.out.println(counter + " nickles"); //testing
					counter++;
					continue;
				}
				else if (change > (coin01 - 0.01)) {
					int counter = 1;
					change -= coin01;
					System.out.println(counter + " pennies"); //testing
					counter++;
					continue;
				}
				else {
					System.out.println("Thank you, come again!");
					break;
				}
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
