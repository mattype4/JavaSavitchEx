package chapter7;
import java.util.Scanner;

public class LetterText {
	private int[] letter = new int[27];
	private char[] word;
	private String line;
	
	public void read(){
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter a string and end with '.':  ");
		line = kbd.nextLine().toLowerCase();
		line = line.substring(0, line.indexOf('.'));
		word = new char[line.length()];
		
		for (int i=0; i<line.length(); i++){
			word[i] = line.charAt(i);
			letter[letterIndex(word[i])]++;
			System.out.println(word[i]);
		}
	}
	
	public void write(){
		System.out.println("The letters are:");
		for (int i=0; i<word.length; i++){
			System.out.println(word[i]);
		}
		System.out.println("The occruances are:  ");
		for (int i=0; i<letter.length; i++){
			if (letter[i]!=0 && i != 26)
				System.out.println((char)(i+97) + ":  " + letter[i]);
			else if (letter[i]!=0 && i==26)
				System.out.println("Space or other :" + letter[i]);
		}
	}
	
	private static int letterIndex(char letter){
		int index = (int)letter - 97;

		if (index<0)
			return 26;
		return index;
	}
}
