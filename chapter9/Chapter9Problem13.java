package chapter9;

import java.util.Scanner;

public class Chapter9Problem13 {

	public static void main(String[] args) {
		/*
		 * 23.5 35 2 10 4.5 3 45 3.5 34 44 5.5 9.6
		 */
		
		Scanner scan = new Scanner(System.in);
		int rows = 3;
		int columns = 4;
		
		double[][] arr = new double[rows][columns];
		
		System.out.println("Enter 12 numbers for the array of locations: ");
		// Reading user inputs and storing to the 2D array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scan.nextDouble();
			}
		}
		
		Location maxLocation = locateLargest(arr);
		System.out.println(maxLocation.toString());

	}
	
	public static Location locateLargest(double[][] a) {
		double maxValue = Double.MIN_VALUE;
		int maxRow = -1;
		int maxCol = -1;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				// Scenario 1: New max value
				if (a[i][j] > maxValue) {
					maxValue = a[i][j];
					maxRow = i;
					maxCol = j;
				}
				
				// Scenario 2: Current value at a[i][j] is equal to our current found maxValue
				// Check whether this current value occurs at a row AFTER the previous max
				// If this is true, do not record because current row > previous row
				// If current row = maxRow --> check based on column index
				// if maxCol < j --> update maxCol to current column otherwise keep same
				if (a[i][j] == maxValue) {
					if (i == maxRow) {
						if (j < maxCol) {
							maxCol = j;
						}
					} else {
						// Scenario occurs when row is not the same
						maxRow = Math.min(maxRow, i);
					}
				}
			}
		}
		
		Location instance = new Location(maxRow, maxCol, maxValue);
		return instance;
	}

}
