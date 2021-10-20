package chapter5;

public class Chapter5Notes {

	public static void main(String[] args) {
		// -----------------------
		// The While Loop
		
		// For loop
		// 1. Printing numbers from 1 to 10
		
//		for (int i = 1, j = 10, k = 20; i < 11 && j < 15; i++, j++) {
//			System.out.println(i + " " + j + " " + k);
//		}
		
		// 2. Exercise 2 solution
//		int iterationNumber = 1;
//		for (int i = 1, j = 50; i <= j; i = i + 2, j++) {
//			System.out.println("Value of i = " + i + "|Value of j = " + j + "|" + iterationNumber);
//			iterationNumber = iterationNumber + 1;
//		}
		
		// 3. Nested loop
//		int count = 1;
//		for (int i = 0; i <= 10; i++) {	// 11 iteration outer loop, 5 inner iterations, 11 * 5 = 55 total iterations
//			for (int j = 25; j < 30; j++) {
//				// i = 1, j = 25 -> 30 --> 5 iterations
//				// i = 2, j = 25 -> 30 --> 5 iterations
//				// i = 3, j = 25 -> 30 --> 5 iterations
//				System.out.println(count);
//				count++;
//			}
//		}
		
		// 4. Break
		// Print out first 5 numbers that are divisible by 3
		int n = 1;
		int numbersFound = 0;
//		while(numbersFound < 5) {
//			if (n % 3 == 0) {
//				numbersFound++;
//				System.out.println(n);
//			}
//			n++;
//		}
		
		// Solution 2 - Using break
//		while(true) {
//			if (n % 3 == 0) {
//				numbersFound++;
//				System.out.println(n);
//				if (numbersFound == 5) {
//					break;
//				}
//			}
//			n++;
//		}
		
		// 5. Continue - Print all numbers from [1,20] except the ones divisible by 3
//		for (int i = 1; i <= 20; i++) {
//			if (i % 3 == 0) {
//				continue;
//			}
//			System.out.println(i);
//		}
	}

}
