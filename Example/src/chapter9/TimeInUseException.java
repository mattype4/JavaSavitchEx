package chapter9;

public class TimeInUseException extends Exception{
	public TimeInUseException(){
		super("Time is used");
	}
	
	public TimeInUseException(String message){
		super(message);
	}
}
