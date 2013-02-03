package chapter9;

public class DivideByZeroException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7183105773902542924L;

	public DivideByZeroException(){
		super("Dividing by Zero");
	}
	
	public DivideByZeroException(String message){
		super(message);
	}
}
