package chapter7;
import java.util.Scanner;

public class ArraySort {
	private int[] num;
	private int numForArray;

	public void read(){
		Scanner kbd = new Scanner(System.in);
		System.out.println("How many numbers?");
		numForArray = kbd.nextInt();
		num = new int[numForArray];
		System.out.println("Enter " + numForArray + " numbers");
		for (int i=0; i<numForArray; i++){
			num[i] = kbd.nextInt();
		}
		num = insertionSort(num);
		for (int i=0; i<numForArray; i++)
			System.out.println(num[i]);
	}
	
	public static int[] bubbleSort(final int[] num){
		int temp;
		int[] tempNum = new int[num.length];
		for (int i=0; i<num.length; i++)
			tempNum[i] = num[i];
		
		for(int i=1; i<num.length; i++){
			for (int j=0; j<num.length-1; j++)
				if (tempNum[j] > tempNum[j+1]){
					temp = tempNum[j];
					tempNum[j] = tempNum[j+1];
					tempNum[j+1] = temp;
				}
		}
		return tempNum;
	}
	
	public static int[] insertionSort(final int[] num){
		int key, j;
		int[] tempNum = new int[num.length];
		for (int i=0; i<num.length; i++)
			tempNum[i] = num[i];
		
		for (int i=1; i<num.length; i++){
			key = tempNum[i];
			j = i-1;
			while (j>=0 && key<tempNum[j]){
				tempNum[j+1] = tempNum[j];
				j--;
			}
			tempNum[j+1] = key;
		}
		
		return tempNum;
	}
}
