package chapter7;
import java.util.Scanner;
import java.text.DecimalFormat;

public class NumArray {
	private int[] num;
	private int amount, sum=0;
	private double percent;
	
	public void readIn(){
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Enter the amount to insert:  ");
		amount = kbd.nextInt();
		num = new int[amount];
		
		for (int i=0; i<amount; i++){
			System.out.println("Enter value for index:  " + i);
			num[i] = kbd.nextInt();
			sum += num[i];
		}
		
		writeOut();
		
	}
	
	private void writeOut(){
		DecimalFormat f = new DecimalFormat("0.0000");
		System.out.println("The total is:  " + sum + 
					"\nThe different valuse are:  ");
		for (int i=0; i<amount; i++){
			percent = 100.0*num[i]/sum;
			System.out.println(num[i] + ", which is " + f.format(percent) +
					"% of the sum.");
		}
	}
}
