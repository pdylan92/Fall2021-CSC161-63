package chapter9;

public class Chapter9Problem6 {

	public static void main(String[] args) {
		// Array with [0, 999]
		StopWatch sw = new StopWatch();
		int[] numbers = new int[100000];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 1000);
		}
//		printArray(numbers);
		
		sw.start();
		selectionSort(numbers);
		sw.stop();
		System.out.println("Total time to sort numbers = " + sw.getElapsedTime() + " ms.");
		

	}
	
	public static void selectionSort(int[] numbers) {
		
		// [1,3,7,5]   | minValue = 1 and minIndex = 3
		// temp = 5
		// numbers[i] = 1
		// numbers[minIndex] = 5
		
		
		int minValue, minIndex;
		for (int i = 0; i < numbers.length; i++) {
			minValue = numbers[i];
			minIndex = i;
			
			// Loop through the rest of the array to find if a new minValue exists
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < minValue) {
					minValue = numbers[j];
					minIndex = j;
				}
			}
			
			// Swapping logic: Store a temporary value numbers[i], then we overwrite numbers[i] = numbers[minIndex]
			// And finally in numbers[minIndex] = temp;
			int temp = numbers[i];
			numbers[i] = minValue;
			numbers[minIndex] = temp;
		}
	}
	
	public static void printArray(int[] num) {
		int count = 0;
		for (int el: num) {
			System.out.print(el + " ");
			count++;
			if (count == 30) {
				System.out.println();
				count = 0;
			}
		}
	}

}
