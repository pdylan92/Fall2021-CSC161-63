package chapter3;

import java.util.Scanner;

public class Chapter3Slide30 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter some weight for a package: ");
		double weight = input.nextDouble();
		
		// Validation check.
		// 1. weight < 0
		// 2. weight > 20
		
		if (weight <= 0 || weight > 20) {
			System.out.println("Invalid weight entered.");
			System.exit(0);
		}
	
		// [-inf, +inf]
		// 1. (0, +inf] -> After first validation check is complete
		// 2. (0, 20] -> After second validation is complete
		double cost = 0;
		
		// Condition 1 will be true IF weight = (0, +inf) 
		// Condition 2 will be true IF weight = (-inf, 1]
		if (weight > 0 && weight <= 1) {
			cost = 3.5;
			// If we get past first check then our remaining interval will be (1, 20]
		} else if (weight > 1 && weight <= 3) {
			cost = 5.5; 
			// If we get past first check then our remaining interval will be (3, 20]
		} else if (weight > 3 && weight <= 10) {
			cost = 8.5;
			// If we get past first check then our remaining interval will be (10, 20]
		} else {
			// Weight is guaranteed to be between (10, 20] after all previous if statements have 
			// failed to execute
			cost = 10.5;
		}
		
		System.out.println("Cost to ship package is " + cost);
		
	}

}
