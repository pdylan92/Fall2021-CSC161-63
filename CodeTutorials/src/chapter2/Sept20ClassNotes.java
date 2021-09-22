package chapter2;

public class Sept20ClassNotes {

	public static void main(String[] args) {
		int value = 10;
		// Assume value is some variable defined
	 	// Pre increment: ++value -> Add 1 to value and then read from it
		// Post increment: value++ -> Read the value FIRST and then increase
		// Pre decrement: --value
		// Post decrement value--
		// increment/decrement operators MODIFY the existing variable and reassign
		// it back. They can be used as an assignment expression or within a print
		// statement
		
		// Within an expression
		int changedValue = ++value;
		
		// changedValue = value + 1
		// value will be incremented to 11
		
		// Numeric Conversion: We can cast one value to be a data type of another
		// value.
		int integerValue = 10;
		double decimalValue = 5.5;
		
		// If we want to change decimalValue from type double to an int we use
		// (int) in front of the assignment to convert it.
		// Rule: When converting from decimal -> we DROP the decimal portion
		// Rule: When converting from int -> decimal we ADD a ".0" at the end of the integer
		
		// Convert an integer to a double
		decimalValue = (double) integerValue;
		
		// Convert a decimal to an integer
		integerValue = (int) decimalValue;
		
		// 1.5
		// Every input in division is an integer, we perform integer division
		// Results in decimal being drop
		// Solution - Convert one number explictly into a float/double
		int v1 = 3, v2 = 2;
		System.out.println(((double)v1/ v2));
		
	}
	
}
