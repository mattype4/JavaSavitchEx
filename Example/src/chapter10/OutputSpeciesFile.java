package chapter10;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;
import java.util.Scanner;

public class OutputSpeciesFile {

	public static void input(){
		Scanner kbd = new Scanner(System.in);
		String input, file;
		int population;
		double growth;
		ObjectOutputStream outputStream;
		
		
		System.out.println("Enter file to write to:");
		file = kbd.next();
		try{
			outputStream = new ObjectOutputStream(new FileOutputStream(file));
			
			System.out.println("Please enter a species to add or 'done' to finish");
			input = kbd.next();

			while (!(input.toLowerCase().equals("done"))){
				System.out.println("Please enter a population for " + input);
				population = kbd.nextInt();
				System.out.println("Please enter growth rate for " + input);
				growth = kbd.nextDouble();
				outputStream.writeObject(new Species(input, population, growth));
				
				System.out.println("Please enter a species to add or 'done' to finish");
				input = kbd.next();
			}
				
			outputStream.close();
		} catch (FileNotFoundException e){
			System.out.println("The file not found.");
		} catch (IOException e){
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void readObj(){
		String file;
		String name;
		Species mark, right = null;
		ObjectInputStream inputStream;
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter the file to read from:");
		file = kbd.next();
		System.out.println("Enter species to find.");
		name = kbd.next();
		try{
			inputStream = new ObjectInputStream(new FileInputStream(file));
			
			try{
				mark = (Species)inputStream.readObject();
				while(!(name.equals(mark.getName()))){
					mark = (Species)inputStream.readObject();
				}
				right = mark;
			} catch(EOFException e){
				System.out.println("End of file.");
			}
			
			
			inputStream.close();
		} catch(ClassNotFoundException e){
			System.out.println("No class found");
		} catch(FileNotFoundException e){
			System.out.println("File not found.");
		} catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		if (right == null){
			System.out.println("Species does not exist");
		} else{
			System.out.println(right);
		}
		
	}
	
	public static void findMinMax(){
		Scanner kbd = new Scanner(System.in);
		ObjectInputStream inputStream;
		Species low=null, high=null, test;
		String file;

		
		System.out.println("Enter file name:");
		file = kbd.next();
		
		try {
			inputStream = new ObjectInputStream(new FileInputStream(file));
			
			try{
				low = high = (Species)inputStream.readObject();

				
				while(true){
					test = (Species)inputStream.readObject();
					if(test.getPopulation()<low.getPopulation())
						low = test;
					if(test.getPopulation()>high.getPopulation())
						high = test;
				}
				
			} catch(EOFException e){
				System.out.println("End of file.");
			}
			
			
		} catch(ClassNotFoundException e){
			System.out.println("No class found");
		} catch(FileNotFoundException e){
			System.out.println("File not found.");
		} catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("The low population species:  ");
		System.out.println(low);
		System.out.println();
		System.out.println("The high population species:  ");
		System.out.println(high);
		
	}
	
}
