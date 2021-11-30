package chapter9;

public class Chapter9Problem2 {

	public static void main(String[] args) {
		// Symbol = ORCL, name = "Oracle", previousPrice = 34.5
		Stock oracleStock = new Stock("ORCL", "Oracle");
		oracleStock.setPreviousClosingPrice(34.5);
		oracleStock.setCurrentPrice(34.35);
		
		System.out.printf("Percent change from yesterday is %5.2f%%", oracleStock.getPrecentChange());

	}

}
