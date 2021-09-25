package chapter2;

import java.util.Scanner;

public class Chapter2Practice10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double M, finalTemperature, initialTemperature;
		final short ENERGY_CONSTANT = 4184;
		
		// 1. Read user input
		System.out.println("Enter water in kilograms (M), final/initial temp: ");
		M = input.nextDouble();
		finalTemperature = input.nextDouble();
		initialTemperature = input.nextDouble();
		
		// 2. Compute energy (Q)
		double Q = M * Math.abs((finalTemperature - initialTemperature)) * ENERGY_CONSTANT;
		
		// 3. Display results
		System.out.println("The energy needed is: " + Q);
		System.out.println("The energy needed is: " + Math.abs((M * (finalTemperature - initialTemperature)) * ENERGY_CONSTANT));
	}

}
