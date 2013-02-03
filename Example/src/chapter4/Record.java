package chapter4;

public interface Record {
	
	public double getQuiz1();
	public double getQuiz2();
	public double getExam1();
	public double getExam2();
	
	public void setQuiz1(double newQuiz1);
	public void setQuiz2(double newQuiz2);
	public void setExam1(double newExam1);
	public void setExam2(double newExam2);
	
	public void calcFinal();
	public void read();
	public String toString();

	
}
