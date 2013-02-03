package chapter10;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class FormatText {

	
	public void format(){
		String fileInput, fileOutput, word;
		boolean lastPunc = false;
		Scanner kbd = new Scanner(System.in);
		Scanner inputStream;
		PrintWriter outputStream;
		
		System.out.println("Enter the file to read from:  ");
		fileInput = kbd.next();
		System.out.println("Enter the file to write to:  ");
		fileOutput = kbd.next();
		
		try{
			inputStream = new Scanner(new File(fileInput));
			outputStream = new PrintWriter(new FileOutputStream(fileOutput));
			
			if (inputStream.hasNext()){
				word = inputStream.next();
				word = word.substring(0,1).toUpperCase() + 
						word.substring(1, word.length());
				outputStream.write(word);
				if (containsPunc(word))
					lastPunc = true;
			}
			while(inputStream.hasNext()){
				word = inputStream.next();
				if (lastPunc){
					word = " " + word.substring(0,1).toUpperCase() + 
							word.substring(1, word.length());
					lastPunc = false;
				} else{
					word = " " + word;
				}
				outputStream.write(word);
				if (containsPunc(word))
					lastPunc = true;
			}
			
			inputStream.close();
			outputStream.close();
		} catch (FileNotFoundException e){
			System.out.println("The file could not be found.");
			return;
		}
	}
	
	private boolean containsPunc(String wordCheck){
		if (wordCheck.contains(".") || wordCheck.contains("?") ||
				wordCheck.contains("!"))
			return true;
		else 
			return false;
	}
}
