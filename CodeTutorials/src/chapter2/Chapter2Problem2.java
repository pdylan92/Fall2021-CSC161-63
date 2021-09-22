package chapter2;

import java.util.Scanner;

public class Chapter2Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius, length;
		double area, volume;
		
		
		// 1. Read in user inputs: radius and length
		System.out.println("Enter a radius for the cylinder: ");
		radius = input.nextDouble();
		System.out.println("Enter a length for the cylinder: ");
		length = input.nextDouble();
		
		// 2. Compute area and volume
		area = Math.pow(radius, 2) * Math.PI;
		volume = area * length;
		
		// 3. Print results to the console
		System.out.println("Calculated area with radius = " + radius + " is " + area);
		System.out.println("Calculated area with length = " + length + " is " + volume);
		
		// 4. Close scanner object
		input.close();
	}

}
