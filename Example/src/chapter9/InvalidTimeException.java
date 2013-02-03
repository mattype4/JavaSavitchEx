package chapter9;

public class InvalidTimeException extends Exception{
	public InvalidTimeException(){
		super("Time is not allowed");
	}
	
	public InvalidTimeException(String message){
		super(message);
	}
}
