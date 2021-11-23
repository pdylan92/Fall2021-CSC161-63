package chapter9;

import java.util.Scanner;

public class Chapter9Notes {

	public static void main(String[] args) {
//		Circle c = new Circle();
		Circle c1 = new Circle(100, "blue");
		Circle c1dup = new Circle(50, "silver");
//		Circle c2 = new Circle(50, "blue");
		
//		System.out.println(c1.calculateArea());
//		System.out.println(c1.toString());
		
//		System.out.println(c1.equals(c1dup));
		
		Circle[] circleArray = new Circle[20];
		
		for (int i = 0; i < 20; i++) {
			if (Circle.getNumberOfObjects() <= 10) {
				circleArray[i] = new Circle(i);
				System.out.println(circleArray[i].toString());
			} else {
				break;
			}
		}
		
		System.out.println("Total circle objects made = " + circleArray.length);
		
		
		
		
	}
}