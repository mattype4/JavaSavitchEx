package chapter9;

public class IncorrectColorException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8231346374523315065L;


	public IncorrectColorException(){
		super("Incorrect Color");
	}
	
	public IncorrectColorException(String message){
		super(message);
	}
}
