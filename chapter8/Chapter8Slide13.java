package chapter8;

import java.util.Scanner;

public class Chapter8Slide13 {

	public static void main(String[] args) {
		
		// A B A B D D C A D E C C A A B C B A D D
		
		Scanner input = new Scanner(System.in);
		char[][] submissions = new char[4][5];
		
//		char[][] submissions = {
//				{'A', 'B', 'A', 'B', 'D'},
//				{'D', 'C', 'A', 'D', 'E'},
//				{'C', 'C', 'A', 'A', 'B'},
//				{'C', 'B', 'A', 'D', 'D'}
//		};
		
		char[] key = {'C', 'B', 'A', 'D', 'D'};
		
		for (int row = 0; row < submissions.length; row++) {
			for (int col = 0; col < submissions[row].length; col++) {
				submissions[row][col] = input.next().charAt(0);
			}
		}
		
		// print2DArray(submissions);
		
		for (int row = 0; row < submissions.length; row++) {
			System.out.println("Score for student " + (row + 1) + " is " + validateResults(submissions[row], key));
		}
		

	}
	
	public static double validateResults(char[] currentStudent, char[] answers) {
		int count = 0;
		for (int i = 0; i < answers.length; i++) {
			if (currentStudent[i] == answers[i]) {
				count++;
			}
		}
		
		return (count / (double) answers.length) * 100;
	}
	
	public static void print2DArray(char[][] arr) {
		for (char[] array: arr) {
			print1DArray(array);
		}
	}
	
	public static void print1DArray(char[] arr) {
		for (char el : arr) {
			System.out.print(el + " ");
		}
		System.out.println();
	}

}
