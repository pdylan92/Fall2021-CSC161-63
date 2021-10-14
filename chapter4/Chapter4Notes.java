package chapter4;

import java.util.Scanner;

public class Chapter4Notes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Escape sequence -> Including "tab" in output
//		char test = '\t';
//		
//		System.out.println("Test: " + test + " Test");
		// --------------------------------------------------------------------------------
		
		// name.length() = total characters in the string
		// index values start from 0 (first value) and end at name.length() - 1
		String name = "Abcd";
		String name2 = "abcd";
		
		// Gives out of bounds error. Need to make sure the character you are accessing is within range [0, length-1]
//		System.out.println(name.charAt(100));
		
		String age = "30";
		// Integer.parseInt(string) takes a string and tries to convert it to an integer. Strings can hold numbers
		// as well but in String format. When it comes to doing mathematical computations the numbers in strings are
		// useless so we can try a conversion. 
		System.out.println("Age after 1 year will be " + (Integer.parseInt(age) + 1));
//		------------------------------------------------------------------------------------------
		
//		name = name.toUpperCase();	// ABCD
//		System.out.println(name);
		
		// Example 1. next() vs. nextLine()
		
		// Reading in single characters
//		System.out.println("Enter words separated by a whitespace:");
//		String word = input.nextLine();
//		System.out.print("Character at index 10 is: ");
//		
		// Example 2. Reading in single character from user input - no direct way but with a combination of next() or
		// nextLine() and charAt() you can read in single values. Need to perform validation checks however
		
		// int index = 10
//		if (!(word.length() >= index + 1)) {
//			System.out.println("Length of string is too short.");
//			System.exit(0);
//		}
//		
//		System.out.println(word.charAt(index));

		// Comparing values
//		System.out.println(name.contains("cd"));
		

		// Substring:	o - 10, second o - 11
//		String fullString = "Apple macbook";
//		String substring = fullString.substring(0,5).toUpperCase();
//		int beginWord = fullString.lastIndexOf("z");
//		System.out.println(beginWord);
//		
//		if (beginWord == -1) {
//			System.out.println("Letter z does not exist");
//		}
		
		
		// Example 3. printf
//		
//		System.out.printf("The number 12 with width of 5 that is right justified =%-5d and another example %10d", 12, 24);
//		System.out.println();
		// Decimal counts as a character for "width"
		System.out.printf("Limiting to width 5 with only 2 decimals=%-10.2f", 0.333333333);
	}

}
