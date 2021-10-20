package chapter5;

public class Chapter5Slide18 {

	public static void main(String[] args) {
		
		int count = 0;
		for (int i = 100; i <= 200; i++) {		// [100,200]
			// 1. Number has to be divisible by 5 -> i % 5 == 0
			// 2. Number has to be divisble by 6 -> i % 6 == 0
			// 3. Not Divisible by both 5 and 6 --> !(i % 5 == 0 && i % 6 == 0)
			if (i % 5 == 0 || i % 6 == 0 && !(i % 5 == 0 && i % 6 == 0)) {
				System.out.print(i + " ");
				count++;
				if (count == 10) {
					System.out.println();
					count = 0;
				}
			}
		}

	}

}
