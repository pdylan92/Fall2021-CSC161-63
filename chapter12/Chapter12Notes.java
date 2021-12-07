package chapter12;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Chapter12Notes {

	public static void main(String[] args) {
		String path = "C:\\Users\\dylan\\Documents\\MCC\\CSC161\\Fall 2021\\Chapter 12\\sample.txt";
		String outputPath = "C:\\Users\\dylan\\Documents\\MCC\\CSC161\\Fall 2021\\Chapter 12\\output.txt";
		
		File file = new File(path);
		File outputFile = new File(outputPath);
		
		try {
			Scanner input = new Scanner(file);
			PrintWriter output = new PrintWriter(outputFile);
			
			while(input.hasNextLine()) {
				String data = input.nextLine();
				if (Character.isDigit(data.charAt(0))) {
					output.println(data);
				}
			}
			
			output.close();
		} catch (Exception e) {
			System.out.println("all other exceptions go here.");
		}
		
		System.out.println("Reached end of program");
	}

}
