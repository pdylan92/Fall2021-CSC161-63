package chapter5;

import java.util.Scanner;

public class Chapter5Slide6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 1. Generate a number [1,10]
		int generatedNumber = (int) ((Math.random() * (10 - 1)) + 1);
		System.out.println("Random number generated = " + generatedNumber);
		
		// 2. Setup of while loop. Loop stops when retries = 0
		int retries = -1;
		while (retries > 0) {		//[3, +inf]
			System.out.println("Enter a number between [1,10]: ");
			int number = input.nextInt();
			
			// Check if user input is equal to our generated number
			if (number == generatedNumber) {
				// Guess is correct
				System.out.println("You guessed correctly!");
				// Exit the loop 
				retries = 0;
			} else {
				// Remove one attempt from retries
				retries--;
				System.out.println("Incorrect value entered, try again.");
			}
		}
		
		// Same solution but using do-while loop
//		do {
//			// Statements
//			System.out.println("Enter a number between [1,10]: ");
//			int number = input.nextInt();
//			
//			// Check if user input is equal to our generated number
//			if (number == generatedNumber) {
//				// Guess is correct
//				System.out.println("You guessed correctly!");
//				// Exit the loop 
//				retries = 0;
//			} else {
//				// Remove one attempt from retries
//				retries--;
//				System.out.println("Incorrect value entered, try again.");
//			}
//		} while (retries > 0);
		
	}

}
