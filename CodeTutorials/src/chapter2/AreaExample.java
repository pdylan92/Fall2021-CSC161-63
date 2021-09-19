package chapter2;

import java.util.Scanner;

public class AreaExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double PI = 3.14157;
		
		// 1. Read in user input
		// Whenever we read from a user input, always remember to prompt the user with the information
		// we are asking for with the use of a print statement
		System.out.println("Enter a radius for a circle");
		double radius = input.nextDouble();
		
		// 2. Compute area of a circle
		
		// Computing area using Math class and pow() method
		// Math.pow(base, exponent) returns a value, which means we can assign it to a variable
		// double area = Math.pow(PI, radius);
		double area = PI * radius * radius;		// Assignment expression
		// Expression means get some computed value and then assign the variable this
		// value
		
		// 3. Display results to the console
		System.out.println("Computed area with radius " + radius + " is " + area);
		
		// Always close scanner object at the end of usage
		input.close();
	}

}
