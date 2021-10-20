package chapter5;

public class Chapter5Revel15 {

	public static void main(String[] args) {
		
		int count = 0;
		for (int i = 33; i <= 126; i++) {
			
			System.out.print((char) i + " ");
			count++;
			
			if (count == 10) {
				System.out.println();
				count = 0;
			}
		}

	}

}
