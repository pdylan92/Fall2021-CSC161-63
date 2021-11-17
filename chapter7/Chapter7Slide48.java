package chapter7;

public class Chapter7Slide48 {

	public static void main(String[] args) {
		// Create array to hold 100 random numbers
		int[] randomNumbers = new int[100];
		
		// Run a for loop to populate the array. We can use Math.random() * 10 to generate from [0, 10-1] range
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = (int) (Math.random() * 10);
		}
		
		// Count will be used to hold our occurrences. Each index will reference the value from [0,9] and the 
		// value AT the index will be the occurrence. Ex. At index 0, if you have 42 it means 0 occurred 42 times.
		int[] count = new int[10];
		
		// Iterate over random numbers, each number from [0,9] will be an index in count so we can jump to that index
		// in count and increment it by 1
		for (int el : randomNumbers) {
			count[el]++;
		}
		
		// Print results
		printArr(count);

	}
	
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Count for " + i + " is " + arr[i]);
		}
	}

}
