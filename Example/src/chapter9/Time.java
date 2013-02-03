package chapter9;

public class Time {
	private String[] names;
	
	public Time(){
		names = new String[6];
	}
	
	public void setTime(int time, String name){
		try {
			if (time <1 || time > 6)
				throw new InvalidTimeException();
			if (names[time] != null)
				throw new TimeInUseException();

		} catch (TimeInUseException e){
			System.out.println(e.getMessage());
			return;
		} catch (InvalidTimeException e){
			System.out.println(e.getMessage());
			return;
		} 
		System.out.println("After the catches");
		names[time] = name;
	}
	
	public void printOut(){
		for (int i=0; i<6; i++){
			System.out.println("Time " + i + ":  " + names[i]);
		}
	}
}
