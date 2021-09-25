package chapter2;

import java.util.Scanner;

public class Chapter2Practice7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long minutes;
		// Input total minutes -> whole years + days remaining in a whole year
//		System.out.println("Enter some number of minutes: ");
//		minutes = input.nextLong();
		
		// Time elapsed from 1/1/70 in ms
		long curTime = System.currentTimeMillis();
		minutes = curTime / 1000 / 60;
		
		/*
		 * 1 year = 365 days | 1 day = 24 hours | 1 hour = 60 min
		 * 1 year = 365 * 24 * 60
		 * 1 day = 24hrs * 60min
		 */
		
		// Conversion from minutes -> hours -> days -> years
		long years = minutes / 60 / 24 / 365; // whole years.remainingDays
		long days = (minutes / (60 * 24)) % 365; // remaining days to make up one full year
		
		System.out.println("Years=" + years + "|Days=" + days);
	}

}
