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
		change = Math.round(change * 100.0) / 100.0;
		int counter = 0;

		if (price < payment) {
			System.out.println("Change: $" + change);
			System.out.println(" ");
			System.out.println("Hand the customer: ");

			for (counter = 0; change > bill20; counter++) {
				change -= bill20;
			}
			if (counter > 0) {
				handToCustomer(counter, bill20);
			}

			for (counter = 0; change > bill10; counter++) {
				change -= bill10;
			}
			if (counter > 0) {
				handToCustomer(counter, bill10);
			}

			for (counter = 0; change > bill5; counter++) {
				change -= bill5;
			}
			if (counter > 0) {
				handToCustomer(counter, bill5);
			}

			for (counter = 0; change > bill1; counter++) {
				change -= bill1;
			}
			if (counter > 0) {
				handToCustomer(counter, bill1);
			}

			for (counter = 0; change > coin25; counter++) {
				change -= coin25;
			}
			if (counter > 0) {
				if (counter == 1) {
					System.out.println(counter + " quarter");
				} else {
					System.out.println(counter + " quarters");
				}
			}

			for (counter = 0; change > coin10; counter++) {
				change -= coin10;
			}
			if (counter > 0) {
				if (counter == 1) {
					System.out.println(counter + " dime");
				} else {
					System.out.println(counter + " dimes");
				}
			}

			for (counter = 0; change > coin05; counter++) {
				change -= coin05;
			}
			if (counter > 0) {
				if (counter == 1) {
					System.out.println(counter + " nickel");
				} else {
					System.out.println(counter + " nickels");
				}
			}

			change = Math.round(change * 100.0) / 100.0;
			for (counter = 0; change >= coin01; counter++) {
				change = Math.round(change * 100.0) / 100.0;
				change -= coin01;
			}
			if (counter > 0) {
				if (counter == 1) {
					System.out.println(counter + " penny");
				} else {
					System.out.println(counter + " pennies");
				}
			}

		} else if (price > payment) {
			System.out.println("Insufficient payment.");
			System.out.println(
					"Ask customer to provide additional money" + ", or insist customer seek better-paying employment.");
		} else {
			System.out.println("Exact change provided. Thank you, come again!");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		}
	}

	public static void handToCustomer(int counter, double bill) {
		if (counter == 1) {
			System.out.println((counter) + " $" + bill + "0 dollar bill");

		} else {
			System.out.println((counter) + " $" + bill + "0 dollar bills");
		}
	}

}
