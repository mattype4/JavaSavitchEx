package chapter4;
import java.util.Scanner;

public class GradeDistro {
	int a, b, c, d, f;
	
	GradeDistro(){
		a=b=c=d=f=0;
	}
	
	public void setGrades(){
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter number of grades for A:  ");
		a = kbd.nextInt();
		System.out.println("Enter number of grades for B:  ");
		b = kbd.nextInt();
		System.out.println("Enter number of grades for C:  ");
		c = kbd.nextInt();
		System.out.println("Enter number of grades for D:  ");
		d = kbd.nextInt();
		System.out.println("Enter number of grades for F:  ");
		f = kbd.nextInt();
	}
	
	public void readGrades(){
		System.out.println("Number of grades for A:  " + a);
		System.out.println("Number of grades for B:  " + b);
		System.out.println("Number of grades for C:  " + c);
		System.out.println("Number of grades for D:  " + d);
		System.out.println("Number of grades for F:  " + f);
	}
	
	public int total(){
		return (a+b+c+d+f);
	}
	
	public double percentA(){
		return 100.0*(double)a/((double)a+b+c+d+f);
	}
	
	public double percentB(){
		return 100.0*(double)b/((double)a+b+c+d+f);
	}
	
	public double percentC(){
		return 100.0*(double)c/((double)a+b+c+d+f);
	}
	
	public double percentD(){
		return 100.0*(double)d/((double)a+b+c+d+f);
	}
	
	public double percentF(){
		return 100.0*(double)f/((double)a+b+c+d+f);
	}
	
	public void draw(){
		System.out.print("A |");
		for (int i=0; i<percentA()/2; i++){
			System.out.print("*");
			if((i+1)%5==0 && i!=0)
				System.out.print("|");
		}
		
		System.out.print("\nB |");
		for (int i=0; i<percentB()/2; i++){
			System.out.print("*");
			if((i+1)%5==0 && i!=0)
				System.out.print("|");
		}
		
		System.out.print("\nC |");
		for (int i=0; i<percentC()/2; i++){
			System.out.print("*");
			if((i+1)%5==0 && i!=0)
				System.out.print("|");
		}
		
		System.out.print("\nD |");
		for (int i=0; i<percentD()/2; i++){
			System.out.print("*");
			if((i+1)%5==0 && i!=0)
				System.out.print("|");
		}
		
		System.out.print("\nF |");
		for (int i=0; i<percentF()/2; i++){
			System.out.print("*");
			if((i+1)%5==0 && i!=0)
				System.out.print("|");
		}
		
	}
}
