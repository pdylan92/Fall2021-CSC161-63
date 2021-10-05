package chapter3;

import java.util.Scanner;

public class Chapter3Slide16Improved {

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
		
		if (bmi < 18.5) {
			System.out.println("Underweight");
		} else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("Normal");
			
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("Overweight");
		} else {
			System.out.println("Obese");
		}

	}

}
