package chapter9;

public class Circle {
	
	// Instance variables
	private double radius;
	private String color;
	private static int numberOfObjects = 0;
	

	// If no values passed in, create circle with radius = 1, color = red
	public Circle() {
		this(1.0, "red");
//		System.out.println("Invoking default constructor");
	}
	
	// Constructor to initialize radius value
	// Radius is passed in but color is not defined
	public Circle(double radius) {
		this(radius, "red");
//		System.out.println("Invoking constructor 1");
	}
	
	public Circle(double radius, String color) {
//		System.out.println("Invoking constructor 2");
		if (this.numberOfObjects <= 10) {
			validationCheck(radius);
			this.color = color;
			this.numberOfObjects++;
		}
	}
	
	private void validationCheck(double radius) {
		if (radius >= 1) {
			this.radius = radius;
		} else {
			System.out.println("Radius cannot be 0 or less, setting to 1");
			this.radius = 1;
		}
	}
	
	public double calculateArea() {
		return Math.PI * this.radius * this.radius;
	}
	
	public double calculateCircumference() {
		return 2 * Math.PI * this.radius;
	}

	// -------------------------------------------------------------------------------------------------------
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		validationCheck(radius);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	// ---------------------------------------------------------------------------------------------
	// Generate using source --> generate to string and ONLY selecting the Field checkout
	// toString() method is a quick way to show what the object values are without us having to write multiple print
	// statements
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}

	
	
	
	
	
	
}
