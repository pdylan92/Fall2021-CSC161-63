package chapter2;

public class TimeCalculation {

	public static void main(String[] args) {
		// Epoch time -> (output = long) - number of ms passed from January 1, 1970
		// Epoch time will be 2 hours ahead of current EST
		
		// Give us ms that elapsed from 1/1/70
		long currentTime = System.currentTimeMillis();
		
		// Output current time in format like HH:MM:SS
		
		// ms -> divide 1000 -> (results in seconds)
		// divide 60 -> (results in minutes) divide 24 -> (results in hours)
		
		long currentHour = (currentTime / 1000 / 60 / 24) % 24;
		long currentMinutes = (currentTime / 1000 / 60) % 60;
		long currentSeconds = (currentTime / 1000) % 60;
		
//		System.out.println(currentHour);
//		System.out.println(currentMinutes);
//		System.out.println(currentSeconds);
		
		System.out.println(currentHour + ":" + currentMinutes + ":" + currentSeconds);

	}

}
