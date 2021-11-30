package chapter9;

public class Location {
	
	public int row;
	public int column;
	public double maxValue;
	
	public Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}

	@Override
	public String toString() {
		return "Location [row=" + row + ", column=" + column + ", maxValue=" + maxValue + "]";
	}
	
	

}
