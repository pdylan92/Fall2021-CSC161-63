package chapter5;

import java.util.Scanner;

public class Chapter5Revel9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Variables to hold top 2 students
		String student1 = "";
		String student2 = "";
		double score1 = 0;
		double score2 = 0;
		
		System.out.println("Enter the number of students: ");
		int students = input.nextInt();
		
		for (int i = 1; i <= students; i++) {
			System.out.println("Enter a student name and score: ");
			String student = input.next();
			double score = input.nextDouble();
			
			// Logic to check for our top 2
			// Score 1 = 75 -> 75
			// Score 2 = 60 -> 90
			// New score = 90
			if (score > score1 && score1 < score2) {
				score1 = score;
				student1 = student;
			} else if (score > score2) {
				student2 = student;
				score2 = score;
			}
		}
		
		System.out.println(student1 + " score is " + score1);
		System.out.println(student2 + " score is " + score2);

	}

}
