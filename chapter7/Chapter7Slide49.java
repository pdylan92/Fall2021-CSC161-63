package chapter7;

import java.util.Scanner;

public class Chapter7Slide49 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] inputArray = new double[10];
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = input.nextDouble();
		}
		
		System.out.println("Numbers entered by user: ");
		printArr(inputArray);
		
		System.out.println("Smallest number in the array: " + min(inputArray));

		input.close();
	}
	
	public static double min(double[] array) {
		// Assume the first number is the smallest
		double min = array[0];
		
		for (double el : array) {
			// Math.min returns the smallest number from the argument list. So we can simply check the existing min
			// with the current element in the array to see what's smaller and update min accordingly
			min = Math.min(min, el);
		}
		
		return min;
	}
	
	public static void printArr(double[] arr) {
		for (double el: arr) {
			System.out.print(el + " ");
		}
		System.out.println();
	}

}
