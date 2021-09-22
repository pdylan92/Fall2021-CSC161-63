package chapter2;

import java.util.Scanner;

public class Chapter2Slide22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double price;
		double tax;
		
		final double TAX_RATE = 6.625 / 100;
		
		// 1. Read in price from the user
		System.out.println("Enter the price for an item: ");
		price = input.nextDouble();
		
		// 2. Calculate tax
		tax = price * TAX_RATE;
		
		// 3. Display tax amount
		System.out.println("Tax rate for the item is " + tax);

		input.close();
	}

}
