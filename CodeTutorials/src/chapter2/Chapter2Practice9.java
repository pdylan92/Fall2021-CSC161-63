package chapter2;

import java.util.Scanner;

public class Chapter2Practice9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 5.5, 50.9, 4.5
		double initialVelocity, finalVelocity, time;
		
		// 1. Read in user inputs
		System.out.println("Enter values for: vo, vf, t");
		initialVelocity = input.nextDouble();
		finalVelocity = input.nextDouble();
		time = input.nextDouble();
		
		// 2. Calculate accerlation 
		double a = (finalVelocity - initialVelocity) / time;
		
		// 3. Output results - (e.g. 10.0888)
		System.out.println("Acceleration is: " + a);

	}

}
