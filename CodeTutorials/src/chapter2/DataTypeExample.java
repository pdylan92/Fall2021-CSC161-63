package chapter2;

public class DataTypeExample {

	public static void main(String[] args) {
		
		/* Major numerical data types in Java along with memory
		 * See textbook chart for range of support values
		 * byte - 1 bytes
		 * short - 2 bytes
		 * int - 4 bytes
		 * long - 8 bytes
		 * float - 4 bytes (supports 6-9 decimals)
		 * double - 8 bytes (supports 15-17 decimals)
		 */
		
		// Byte only supports between -128 to 127. If we assign 130 we get an error because 
		// by default all numbers above 127 get treated as in "integer (int)". So we can 
		// explicity convert this int to a byte data type via "type casting"
		byte numberOne = (byte) 130;
		
		// If we print this however we get the value -126
		System.out.println(numberOne);
		
		/*
		 * What's happening here is if we have a positive number we start from 0 and 
		 * move right until we reach that number. But since the right boundary only
		 * goes up until 127 we loop back around to the left side and continue right again.
		 * Hence we moved 128 spaces to the right (we count 0 as a movement)
		 * and our original number was 130. So we will loop around to -128 and have 2 more
		 * spaces to move. So our landing is at -126.
		 */
		
		// Decimals
		
		// Math.PI contains the value of PI by default. So we can use this and store
		// it in a variable to analyze. Math.PI by default is a double data type. To
		// store it inside a float data type we must cast it as a float. 
		final float PI_FLOAT = (float) Math.PI;
		final double PI_DOUBLE = Math.PI;
		
		// We stored PI in both a float and double. By running the below 2 print
		// statements we can see that the number of decimal points printed vary.
		// The double data type is able to show us more decimals which makes the
		// number more precise. The float sacrifices precision for memory optimization
		
		System.out.println("Value of PI in float data type = " + PI_FLOAT);
		System.out.println("Value of PI in float data type = " + PI_DOUBLE);
		
	}

}
