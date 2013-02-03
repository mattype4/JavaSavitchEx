package chapter10;
import java.util.Scanner;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SingleOutputFile {

	private String fileName;
	
	public void writeTo(String file){
		int input, temp=0;
		fileName = file;
		Scanner kbd = new Scanner(System.in);
		ObjectInputStream inputStream = null;
		ObjectOutputStream outputStream = null;
		
		try {
			inputStream = new ObjectInputStream(new FileInputStream(fileName));
			outputStream = new ObjectOutputStream(new FileOutputStream("out2.txt"));
			
			try{
				while(true){
					input = inputStream.readInt();
					if (temp != input){
						outputStream.writeInt(input);
					}
					temp = input;
				}
			} catch (EOFException e){
				System.out.println("The end of the file;");
			}
			inputStream.close();
			outputStream.close();
			
		} catch (FileNotFoundException e){
			System.out.println("Cannot find file " + fileName);
		} catch (IOException e){
			System.out.println("There is an I/O exception. ");
		}
	}
}
