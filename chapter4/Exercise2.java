package chapter4;

public class Exercise2 {

	public static void main(String[] args) {
		
		String licensePlate = "";
		
		// License Plate = LLLDDDD
		
		// Generate uppercase letters from A-Z -> [65,90]
		licensePlate += Character.toString((char) ((int) (Math.random() * (90-65) + 65)));
		licensePlate += Character.toString((char) ((int) (Math.random() * (90-65) + 65)));
		licensePlate += Character.toString((char) ((int) (Math.random() * (90-65) + 65)));
		
		// Generate digits from 0-9 -> [48,57]
		licensePlate += Character.toString((char) ((int) (Math.random() * (57-48) + 48)));
		licensePlate += Character.toString((char) ((int) (Math.random() * (57-48) + 48)));
		licensePlate += Character.toString((char) ((int) (Math.random() * (57-48) + 48)));
		licensePlate += Character.toString((char) ((int) (Math.random() * (57-48) + 48)));
		
		System.out.println(licensePlate);

	}

}
