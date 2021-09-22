package chapter2;

import java.util.Scanner;

public class Chapter2Slide17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int minutes, remainingSeconds;
		int totalSeconds;
		
		
		// 1. Read in user input - seconds
		System.out.println("Enter a value for seconds greater than 0: ");
		totalSeconds = input.nextInt();
		
		// 2. Extract whole number of minutes 
		// and remaining seconds
		
		minutes = totalSeconds / 60;
		remainingSeconds = totalSeconds % 60;
		
		// 3. Print output
		System.out.println("Total minutes = " + minutes + "| Remaining seconds = " + remainingSeconds);
		
		input.close();
	}

}
