package chapter9;

public class StopWatch {
	
	private long startTime;
	private long endTime;
	
	public StopWatch() {
		this.startTime = System.currentTimeMillis();
	}

	public void start() {
		this.startTime = System.currentTimeMillis();
		System.out.println("Started recording at " + this.startTime);
	}
	
	public void stop() {
		this.endTime = System.currentTimeMillis();
	}
	
	// Scenario 1: User hit start and is currently running and they want to find out how many ms went by
	// Scenario 2: User has a stop time recorded and wants to find out the difference between stop - start
	public long getElapsedTime() {
		// User did not stop before and we have do not an endtime recorded
		if (this.endTime == 0) {
			return System.currentTimeMillis() - this.startTime;
		}
		
		// We do have a endtime recorded, endTime != 0
		return this.endTime - this.startTime;
	}
	
	
	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}

}
