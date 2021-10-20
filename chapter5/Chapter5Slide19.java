package chapter5;

import java.util.Scanner;

public class Chapter5Slide19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number n to display the multiplication table from 1 to n:");
		int n = input.nextInt();
		
		// 1st for loop will start from n and go until 1, each iteration we decrement by 1: n, n-1, n-2, ..., 2, 1
		// 2nd loop will go from [1 to 10]
		
		// Ex. n = 6
		// Outer loop: Starts from 6 and goes till 1
		for (int start = n; start >= 1; start--) {
			
			// For each n, multiply by [1,2,3,...10]
			for (int inner = 1; inner <= 10; inner++) {
				System.out.print(start * inner + "\t");
			}
			
			// New line gets added AFTER the inner loop is complete
			System.out.println();
			
		}
		input.close();
	}

}
