package chapter7;
import java.util.Scanner;

public class Palindrome {
	String line;
	char[] lineToChar;
	public void readIn(){
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter the line to be checked as palindrome");
		line = kbd.nextLine().toLowerCase();
		lineToChar = new char[line.length()];
		for (int i=0; i<line.length(); i++){
			lineToChar[i] = line.charAt(i);
		}
		System.out.println(isPalin(lineToChar));
		
	}
	
	private static boolean isPalin(char[] word){
		for (int i=0; i<word.length; i++){
			if (word[i] != word[((word.length-1)-i)])
				return false;
		}
		return true;
	}
}
