package chapter9;

public class MessageTooLongException extends Exception{
	public MessageTooLongException(){
		super("Message Too Long!");
	}
	
	public MessageTooLongException(String message){
		super(message);
	}

}
