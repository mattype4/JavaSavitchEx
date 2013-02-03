package chapter10;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CheckStats {
	
	private int max,min,avg,total,value;
	String theFile;
	Scanner kbd = new Scanner(System.in);
	Scanner inputStream;
	
	public CheckStats(){
		max = min = avg = total = 0;
	}
	
	public File returnFile(String file){
		File someFile = new File(file);
		return someFile;
	}
	
	public void getFileFromUser(){
		System.out.println("Please enter file name:");
		theFile = kbd.next();
	}
	
	
	public void setValues(){
		getFileFromUser();
		File file = returnFile(theFile);
		
		try{
			inputStream = new Scanner(file);
			if (inputStream.hasNextLine()){
				max = min = avg = inputStream.nextInt();
				total++;
			}
			
			while(inputStream.hasNextLine()){
				value = inputStream.nextInt();
				if (value > max)
					max = value;
				if (value < min)
					min = value;
				avg += value;
				total++;
			}
		} catch (FileNotFoundException e){
			System.out.println("File not found.");
			return;
		}
	}
	
	public void printOut(){
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		System.out.println("Average = " + (double)avg/total);
		
	}
}
