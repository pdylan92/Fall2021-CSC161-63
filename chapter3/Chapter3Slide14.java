package chapter3;

import java.util.Scanner;

public class Chapter3Slide14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		 * 1. Read in user inputs for a,b, and c
		 * 2. Calculate discriminant (d)
		 * 3. Output:
		 * 		if d > 0 --> two real roots
		 * 		if d = 0 --> one real root
		 * 		if d < 0 --> no real roots
		 * Sample input: a = 1, b = 0, c = -4 --> x^2 - 16 | rootOne = 2 and rootTwo = -2
		 */

		System.out.println("Enter integer values for a,b,c respectively: ");
		int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
		
		double d = (Math.pow(b, 2) - 4*a*c);
		
		double rootOne = (-b + Math.sqrt(d)) / (2*a);
		double rootTwo = (-b - Math.sqrt(d)) / (2*a);
		
		String message = "";
		
		// d > 0
		if (d > 0) {		// [1, +inf]
			message = "Two real roots";
		} else if (d == 0) {	// [0, 0]
			message = "One real root";
		} else {	// [-inf, 0)
			message = "No real roots";
		}
		
		if (!(d < 0)) {
			System.out.println("Real roots are " + rootOne + " and " + rootTwo);
		}
	
		input.close();
	}

}
