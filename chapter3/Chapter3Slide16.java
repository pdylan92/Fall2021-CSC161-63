package chapter3;

import java.util.Scanner;

public class Chapter3Slide16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 1. Read in user input: height and weight
		System.out.println("Enter height in meters:");
		double height = input.nextDouble();
		
		System.out.println("Enter weight in kilograms:");
		double weight = input.nextDouble();
		
		// 2. Calculate BMI using formula
		final double bmi = weight / (Math.pow(height, 2));
		
		// 3. Print statement according to ranges
		// [- inf to 18.5)
		if (bmi < 18.5) {
			System.out.println("Underweight");
			System.exit(0);
		}
		
		// [18.5, 25)
		if (bmi < 25) {
			System.out.println("normal");
			System.exit(0);
		}
		
		// [25, 30)
		if (bmi < 30) {
			System.out.println("Overweight");
			System.exit(0);
		}
		
		// 30 or higher
		if (bmi >= 30) {
			System.out.println("Obese");
		}
	}

}
