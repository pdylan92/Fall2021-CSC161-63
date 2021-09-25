package chapter2;

import java.util.Scanner;

public class Chapter2Slide27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 1. Read to user input for (x2, x1) and (y2, y1)
		System.out.println("Enter inputs for x2, x1, y2, and y1");
		double x2 = input.nextDouble();
		double x1 = input.nextDouble();
		double y2 = input.nextDouble();
		double y1 = input.nextDouble();
		
		// 2. Compute distance
		
		// 2a. Compute (x2 - x1)^2
		// 2b. Compute (y2 - y1) ^ 2
		double subProblemX = Math.pow(x2 - x1, 2);
		double subProblemY = Math.pow(y2 - y1, 2);
		
		// 2c. Sum both 2a and 2b and take it's square root
//		double distance = Math.pow(subProblemX + subProblemY, 0.5);
		// value^0.5 = sqrt(value)
		 double distance = Math.sqrt(subProblemX + subProblemY);
		 
		 // Single line: "Stages of the order of operations"
		 // Stage 4 is the last step. When writing it in a single line, the 
		 // outermost step should start from the LAST STAGE. In our example
		 // the outermost code happening is Math.sqrt() which is for stage 4.
		 // You should continue to populate the inner stages as you fill in the values
		 // x2 - x1 -> 1
		 // y2 - y1 -> 1
		 // (x2 - x1)^2 -> 2
		 // (y2 - y1)^2 -> 2
		 // subX + subY -> 3
		 // Math.sqrt(subX + subY) -> 4
//		 double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		// 3. Output the distance between the points
		System.out.println("The calculated distance is " + distance);
	}

}
