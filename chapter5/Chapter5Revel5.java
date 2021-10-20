package chapter5;

public class Chapter5Revel5 {

	public static void main(String[] args) {
		// Kilograms will start from 1 -> 199 (odd values) = 99 comps
		// Pounds will start at 20 -> 515 (every multiple of 5) = 99 comps
		
		String kg = "Kilograms";
		String lb = "Pounds";
		System.out.printf("%9s \t %6s | %6s \t %9s", kg, lb, lb, kg);
		System.out.println();
		
		// Initial action variables will start at 1 (kg) and 20 (lbs) respectively
		// Loop continuation: kilograms <= 199 && pounds <= 515
		// Post action: add 2 to kilograms, add 5 to pounds
		for (int kilograms = 1, pounds = 20; kilograms <= 199 && pounds <= 515; kilograms += 2, pounds += 5) {
			
			// Conversions: From kg -> lb = multiply by 2.2
			// From lb - kg = divide by 2.2
			double convertedToPounds = kilograms * 2.2;
			double convertedToKg = pounds / 2.2;
			
			System.out.printf("%-9d \t %6.1f | %-6d \t %9.2f", kilograms, convertedToPounds, pounds, convertedToKg);
			System.out.println();
		}
	}

}
