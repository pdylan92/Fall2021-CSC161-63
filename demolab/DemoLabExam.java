package demolab;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class DemoLabExam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String in = "C:\\Users\\dylan\\Documents\\MCC\\CSC161\\Final\\Sample\\1\\shippingData.txt";
		String out = "C:\\Users\\dylan\\Documents\\MCC\\CSC161\\Final\\Sample\\1\\output.txt";
		
		Container[] containerObjects = new Container[25];
		
		// 1. Read in all data and create objects of this data
		createContainerObjects(containerObjects, in);
		
		int option;
		int queryContainer = 0;
		
		// Loop until a proper option is selected
		while(true) {
			System.out.println("Pick one of the following options");
			System.out.println("1 - Report by container");
			System.out.println("2 - Query by container");
			System.out.println("3 - Exit");
			option = input.nextInt();
			if (option == 3) {
				System.exit(0);
			} else if (option == 1 || option == 2) {
				if (option == 2) {
					System.out.println("Enter the container number to search by.");
					queryContainer = input.nextInt();
				}
				break;
			} else {
				System.out.println("Invalid input entered. Try again.");
			}
		}
		
		int reportOutput;
		
		// Loop until a proper report output option is selected
		while(true) {
			System.out.println("Enter how you would like the output: 1 - file or 2 - console");
			reportOutput = input.nextInt();
			if (reportOutput == 1 || reportOutput == 2) {
				break;
			} else {
				System.out.println("Invalid input entered, try again.");
			}
		}
		
		
		if (option == 1) {
			// Report by all containers
			allContainerOutput(containerObjects, reportOutput, out);
		} else {
			// Report by specific container
			boolean found = false;
			for (Container obj : containerObjects) {
				if (queryContainer == obj.getContainerNumber()) {
					Container[] singleObjArr = new Container[] {obj};
					allContainerOutput(singleObjArr, reportOutput, out);
					found = true;
				}
			}
			
			if (!found) {
				System.out.println("Queried container number does not exist.");
			}
			
		}

	}
	
	public static void createContainerObjects(Container[] arr, String path) {
		File file = new File(path);
		int counter = 0;
		
		// Variables to keep track of total
		int totalTareWeight = 0;
		int totalCargoWeight = 0;
		int totalGrossWeight = 0;
		
		// Validate if file exists, otherwise exit program
		if (!file.exists()) {
			System.out.println("Data file to read does not exist.");
			System.exit(0);
		}
		
		try {
			// Setup scanner object and pass in file to read from
			Scanner input = new Scanner(file);
			
			while(input.hasNext()) {
				int containerNumber = Integer.parseInt(input.nextLine());
				String shipName = input.nextLine();
				int tareWeight = input.nextInt();
				int grossWeight = input.nextInt();
				// Both lines below do the same, first one is general way, second is augmented way
				totalTareWeight = totalTareWeight + tareWeight;
				totalGrossWeight += grossWeight;
				
				if (input.hasNextLine()) {
					input.nextLine();
				}
				
				// Create new container object at index specified by counter variable
				arr[counter] = new Container(containerNumber, shipName, tareWeight, grossWeight);
				totalCargoWeight += arr[counter].getCargoWeight();
				counter++;
			}
			
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Something went wrong parsing data file. Exiting.");
			System.exit(0);
		}
		
		Container.setTotalCargoWeight(totalCargoWeight);
		Container.setTotalGrossWeight(totalGrossWeight);
		Container.setTotalTareWeight(totalTareWeight);
		
		for (Container obj : arr) {
			obj.setPercentTotalCargoWeight();
//			System.out.println(obj.toString());
		}
	}

	public static void allContainerOutput(Container[] arr, int reportOutput, String path) {
		File output = new File(path);
		
		try {
			PrintWriter writer;
			if (reportOutput == 1) {
				// prints to file, initializer printwriter by file object
				writer = new PrintWriter(output);
			} else {
				writer = new PrintWriter(System.out);
			}
			
			/*
			 * Print Headings:
			 * Container Number = 16
			 * Ship Name = 9
			 * Tare Weight = 11
			 * Gross Weight = 12
			 * Cargo Weight = 12
			 * % Cargo Weight = 14
			 * % Total Cargo Weight = 20
			 */
			
			writer.printf("%20s %-20s %20s %20s %20s %20s %25s", "Container Number","Ship Name","Tare Weight","Gross Weight","Cargo Weight","% Cargo Weight","% Total Cargo Weight");
			writer.println();
			
			for (Container obj : arr) {
				int containerNumber = obj.getContainerNumber();
				String shipName = obj.getShipName();
				int tareWeight = obj.getTareWeight();
				int grossWeight = obj.getGrossWeight();
				int cargoWeight = obj.getCargoWeight();
				double percentCargoWeight = obj.getPercentCargoWeight();
				double percentTotalCargoWeight = obj.getPercentTotalCargoWeight();
				writer.printf("%20d %-20s %20d %20d %20d %20.2f %25.2f", containerNumber, shipName, tareWeight, grossWeight, cargoWeight, percentCargoWeight, percentTotalCargoWeight);
				writer.println();
			}
			writer.println();
			writer.printf("%20s %-20s %20d %20d %20d", "", "Total", Container.getTotalTareWeight(), Container.getTotalGrossWeight(), Container.getTotalCargoWeight());
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error writing out data. Exiting.");
			System.exit(0);
		}
		
		
	}
}
