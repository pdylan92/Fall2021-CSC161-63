package chapter3;


import java.util.Scanner;

public class Chapter3Slide15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		/*
		 * 1. Ask user for current day | input = [0,6]
		 * 2. Ask user for x number of days in the future from the day entered
		 * 3. Output is which day we landed on: (input + x) mod 7
		 * Ex. current day to Monday (1), future day 8 | output = Tuesday
		 */
		
		System.out.println("Enter current day of the week [0,6]: ");
		int dayOfWeek = input.nextInt();
		
		// Validation step:
		// Invalid: 
		// 1. input < 0
		// 2. input > 6
		
		String errorMessage = "Input entered was out of bounds";
		boolean isValidInput = true;
		if (dayOfWeek < 0) {
			isValidInput = false;
		}
		
		if (dayOfWeek > 6) {
			isValidInput = false;
		}
		
		// To check value of isValidInput
		if (!isValidInput) {
			System.out.println(errorMessage);
			System.exit(0);
		}
		
		System.out.println("Enter the number of days to go in the future: ");
		int futureDays = input.nextInt();
		
		// Validation check future days input
		if (futureDays < 0) {
			System.out.println("Invalid value for future days");
			System.exit(0);
		}
		
		// dayOfWeek = 1, futureDays = 8 --> 9 % 7 = 2
		int landedDay = (dayOfWeek + futureDays) % 7;	// 0 to 6
		
		// Multi-way if else to print day of the week
		if (landedDay == 6) {
			System.out.println("Saturday");
		} else if (landedDay == 5) {
			System.out.println("Friday");
		} else if (landedDay == 4) {
			System.out.println("Thursday");
		} else if (landedDay == 3) {
			System.out.println("Wednesday");
		} else if (landedDay == 2) {
			System.out.println("Tuesday");
		} else if (landedDay == 1) {
			System.out.println("Monday");
		} else {
			System.out.println("Sunday");
		}
		
	}

}
