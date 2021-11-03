package chapter6;


import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Ex. The curtain is blue.
		System.out.println("Enter a string:");
		String s = scan.nextLine();
		
		int totalNumberOfLetters = countLetters(s);
		
		System.out.println("The total number of letters are " + totalNumberOfLetters);

	}
	
	public static int countLetters(String s) {
		if (s.length() == 0) {
			return 0;
		}
		
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			
			// Enter if statement only if current is a letter
			if (Character.isLetter(current)) {
				count++;
			}
		}
		
		return count;
	}

}
