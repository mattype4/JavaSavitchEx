package chapter12;

public class NoNodeException extends Exception{
	public NoNodeException(){
		super("No Node Exception");
	}
	
	public NoNodeException(String message){
		super(message);
	}
}
