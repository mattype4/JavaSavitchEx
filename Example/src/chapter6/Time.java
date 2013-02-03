package chapter6;

public class Time {
	private int hour, minute;
	private boolean isAM;
	
	public Time(){
		hour = minute = 0;
		isAM = false;
	}
	
	private boolean isValid(int hour, int minute){
		if (hour < 24 && hour >= 0
					&& minute < 60 && minute >= 0)
			return true;
		else
			return false;
	}
	
	public void setTime(int hour, int minute){
		if (isValid(hour, minute)){
			this.hour = hour;
			this.minute = minute;
			
			if (hour < 12)
				this.isAM = true;
			else
				this.isAM = false;
		}
		
		else
			System.out.println("Invalid time.");
		
	}
	
	public void setTime(int hour, int minute, boolean isAM){
		if (isValid(hour,minute)){
			this.hour = hour;
			this.minute = minute;
			this.isAM = isAM;
		}
		else
			System.out.println("Incorrect time.");
	}
}
