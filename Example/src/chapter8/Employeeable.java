package chapter8;

public interface Employeeable extends Personable{
	public void setSalary(double newSalary);
	public void setHire(int newHire);
	public void setId(String newId);
	
	public double getSalary();
	public int getHire();
	public String getId();
}
