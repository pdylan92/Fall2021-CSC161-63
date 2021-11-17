package chapter7;

public class Chapter7Notes {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};			//Memory Block = 1 -> 1,2,3,4,5
//		printArray(arr);
		
		// Assign by reference
		int[] arr2 = arr;					// Memory Block = 1			
//		printArray(arr2);
		
		arr[3] = 100;
//		printArray(arr2);
		
		int[] one = {1,2,3,4,5};
		// Default values in array two are 0's
		int[] two = new int[one.length];
		
		// Copy from array one from position 0 into array two, copy starts at index 2 in second array
		// Last element specifies to copy 3 elements
		System.arraycopy(one, 0, two, 2, 3);
//		printArray(two);
		
		if (one == two) {
			
		}
		
//		System.out.println(one);
		
		// ------------ 11/8/21 Class Notes below this line ------------------
		
		
		double[] arrForMethod = {100.0,200.0,300.0};
		System.out.println("Array before passing to method.");
		printArray(arrForMethod);
		printArray(modifyArray(arrForMethod));
		System.out.println("Array after passing to method");
		printArray(arrForMethod);
	}
	
	// Return a NEW array back. When we create reference values inside methods they get put in the main memory
	// Otherwise when the method exits the data would get destroyed. 
	public static double[] modifyArray(double[] arr) {
		double[] newModifiedArray = new double[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newModifiedArray[i] = arr[i] / 2;
		}
		
		return newModifiedArray;
	}
	
	
	
	public static void printArray(int[] arr) {
		for (int element: arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	public static void printArray(double[] arr) {
		for (double element: arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
