package exams;

public class MidtermBonusQuestion161 {

	/*
	 * Write a program that checks if a string is a palindrome.
	 * Create and use any variables that are needed.
	 */
	
	public static void main(String[] args) {
//		String word = "testword";		// Results in not a palindrome
		 String word = "racecar";		// Results in is a palindrome
		int start = 0, end = word.length() - 1;
		boolean isPalindrome = true;
		
		while(start < end) {
			if (word.charAt(start) != word.charAt(end)) {
				isPalindrome = false;
				break;
			}
			start++;
			end--;
		}
		
		System.out.println(isPalindrome ? "Palindrome!" : "Not a palindrome!");

	}

}
