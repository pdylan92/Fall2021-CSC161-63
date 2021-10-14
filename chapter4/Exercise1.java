package chapter4;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter SSN number in DDD-DD-DDDD format:");
		final String SSN = input.nextLine();
		
		// Validation check
		// 1. Length must be 11 (9 digits and 2 dashes)
		// 2. Dash should be present at index 3 and 6
		
		if (SSN.length() != 11 || SSN.charAt(3) != '-' || SSN.charAt(6) != '-') {
			// Enter this if statement if one of the validation checks failed
			System.out.println(SSN + " is an invalid social security number.");
			System.exit(0);
		} else {
			System.out.println(SSN + " is a valid SSN");
		}

	}

}
