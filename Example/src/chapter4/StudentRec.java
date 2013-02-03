package chapter4;
import java.util.Scanner;

public class StudentRec implements Record {
	private double quiz1, quiz2, exam1, exam2, finalGrade;
	private char letter;

	StudentRec(){
		quiz1 = quiz2 = exam1 = exam2 = finalGrade = 0;
		letter = 0;
	}
	
	public void read(){
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter grade for quiz1:  ");
		quiz1 = kbd.nextDouble();
		
		System.out.println("Enter grade for quiz2:  ");
		quiz2 = kbd.nextDouble();
		
		System.out.println("Enter grade for exam1:  ");
		exam1 = kbd.nextDouble();
		
		System.out.println("Enter grade for exam2:  ");
		exam2 = kbd.nextDouble();
		
	}
	
	public double getQuiz1(){
		return quiz1;
	}
	public double getQuiz2(){
		return quiz2;
	}
	public double getExam1(){
		return exam1;
	}
	public double getExam2(){
		return exam2;
	}
	
	public void setQuiz1(double newQuiz1){
		quiz1 = newQuiz1;
	}
	public void setQuiz2(double newQuiz2){
		quiz1 = newQuiz2;
	}
	public void setExam1(double newExam1){
		quiz1 = newExam1;
	}
	public void setExam2(double newExam2){
		quiz1 = newExam2;
	}
	
	public void calcFinal(){
		finalGrade = (quiz1+quiz2+exam1+exam2)/4.0;
		calcLetter(finalGrade);
	}
	
	private void calcLetter(double grade){
		if (finalGrade <= 100 && finalGrade >= 90)
			letter = 'A';
		else if (finalGrade <= 89 && finalGrade >= 80)
			letter = 'B';
		
		else if (finalGrade <= 79 && finalGrade >= 70)
			letter = 'C';
		else if (finalGrade <= 69 && finalGrade >= 60)
			letter = 'D';
		else 
			letter = 'F';

	}

	public String toString(){
		return ("Final grade = " + finalGrade + "\n" + "Letter:  " + letter);
	}
}
