package demolab;

public class Container {

	private int containerNumber;
	private String shipName;
	private int tareWeight;
	private int grossWeight;
	
	// Compute these values
	// Cargo weight -> Gross weight - tare weight
	private int cargoWeight;
	
	// Percent cargo weight -> (cargo weight / gross weight) * 100
	private double percentCargoWeight;
	
	// Percent total cargo weight -> (cargo weight individually / total sum of all cargo weight) * 100
	private double percentTotalCargoWeight;
	
	// Helper values
	private static int totalCargoWeight;
	private static int totalGrossWeight;
	private static int totalTareWeight;
	
	
	public Container(int containerNumber, String shipName, int tareWeight, int grossWeight) {
		this.containerNumber = containerNumber;
		this.shipName = shipName;
		this.tareWeight = tareWeight;
		this.grossWeight = grossWeight;
		
		this.cargoWeight = grossWeight - tareWeight;
		this.percentCargoWeight = ((double) this.cargoWeight / this.grossWeight) * 100;
	}


	public int getContainerNumber() {
		return containerNumber;
	}


	public void setContainerNumber(int containerNumber) {
		this.containerNumber = containerNumber;
	}


	public String getShipName() {
		return shipName;
	}


	public void setShipName(String shipName) {
		this.shipName = shipName;
	}


	public int getTareWeight() {
		return tareWeight;
	}


	public void setTareWeight(int tareWeight) {
		this.tareWeight = tareWeight;
	}


	public int getGrossWeight() {
		return grossWeight;
	}


	public void setGrossWeight(int grossWeight) {
		this.grossWeight = grossWeight;
	}


	public double getPercentTotalCargoWeight() {
		return percentTotalCargoWeight;
	}


	public void setPercentTotalCargoWeight() {
		if (this.totalCargoWeight == 0) {
			System.out.println("Total cargo weight has not been set.");
			return;
		}
		this.percentTotalCargoWeight = ((double) this.cargoWeight / this.totalCargoWeight) * 100;
	}


	public static int getTotalCargoWeight() {
		return totalCargoWeight;
	}


	public static void setTotalCargoWeight(int totalCargoWeight) {
		Container.totalCargoWeight = totalCargoWeight;
	}


	public static int getTotalGrossWeight() {
		return totalGrossWeight;
	}


	public static void setTotalGrossWeight(int totalGrossWeight) {
		Container.totalGrossWeight = totalGrossWeight;
	}


	public static int getTotalTareWeight() {
		return totalTareWeight;
	}


	public static void setTotalTareWeight(int totalTareWeight) {
		Container.totalTareWeight = totalTareWeight;
	}


	public int getCargoWeight() {
		return cargoWeight;
	}


	public double getPercentCargoWeight() {
		return percentCargoWeight;
	}


	@Override
	public String toString() {
		return "Container [containerNumber=" + containerNumber + ", shipName=" + shipName + ", tareWeight=" + tareWeight
				+ ", grossWeight=" + grossWeight + ", cargoWeight=" + cargoWeight + ", percentCargoWeight="
				+ percentCargoWeight + ", percentTotalCargoWeight=" + percentTotalCargoWeight + "]";
	}
}
