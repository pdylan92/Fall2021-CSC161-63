package chapter6;

public class Chapter6Notes {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 90;

//		int intSum = sumTwoNumbers(num1, num2);
		
		double sum = sumTwoNumbers(48.5, 51.5);
		System.out.println("Num1 = " + num1 + "|Num2 = " + num2);
		
		// Void return type methods MUST be used as a stand alone statement as shown below
//		testMethod(sum);
		
		System.out.println("Sum of both numbers is = " + sum);
		
		
		char character = 'G';
		Character.isLetter(character);

	}
	
	
	public static void testMethod(int number) {
		
		if (number % 10 == 0) {
			System.out.println("Number is divisible by 10");
			return;
		}
		
		System.out.println("Number is not divisible by 10");
		
	}
	
	public static void testMethod(double number) {
		if (number % 10 == 0) {
			System.out.println("Number is divisible by 10");
			return;
		}
		
		System.out.println("Number is not divisible by 10");
	}
	
	// Create a method to add 2 numbers
	// Requirements: 1. Parameters require 2 integers which hold each number
	// 				 2. Sum both of these numbers and return it back (int)
	
	// Parameter set: 
	// 1. int, int
	// 2. Nothing (empty)
	// 3. double, double
	public static int sumTwoNumbers(int num1, int num2) {
		
		int sum = num1 + num2;
		System.out.println("Invoking sumTwoNumbers method");
		testMethod(sum);
		
		num1 = 1000;
		num2 = 2000;
		return sum;
	}
	
	public static int sumTwoNumbers() {
		System.out.println("sumTwoNumbers invokved with no arguments passed");
		int num1 = 100;
		System.out.println(num1);
		return 0;
	}
	
	public static double sumTwoNumbers(double num1, double num2) {
		System.out.println("Invoking sumTwoNumbers method with return type double");
		testMethod(num1 + num2);
		return num1 + num2;
		
	}
	
	/* Call Stack
	 * 
	 * 
	 * 
	 */

}
