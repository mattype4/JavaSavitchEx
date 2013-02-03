package chapter10;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;

public class WriteToBinary {
	private String file;
	
	public void writeTo(String fileName){
		file = fileName;
		int value=0;
		Scanner kbd = new Scanner(System.in);
		ObjectOutputStream outputStream;
		
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream(file));
			
			while (value != -1){
				System.out.println("Enter values until you hit -1");
				value = kbd.nextInt();
				if (value == -1)
					break;
				outputStream.writeInt(value);
			}
			outputStream.close();
		} catch (FileNotFoundException e){
			System.out.println(e.getMessage());
			return;
		} catch (IOException e){
			System.out.println(e.getMessage());
			return;
		}
		
	}
	
	public void readFrom(String fileName){
		ObjectInputStream inputStream;
		file = fileName;
		
		try{
			inputStream = new ObjectInputStream(new FileInputStream(file));
			
			try{
				while(true){
					System.out.println(inputStream.readInt());
				}
			} catch (EOFException e){
				System.out.println("The end of the file.");
			}
			inputStream.close();
		} catch (FileNotFoundException e){
			System.out.println(e.getMessage());
			return;
		} catch (IOException e){
			System.out.println(e.getMessage());
			return;
		}	
		
	}
}
