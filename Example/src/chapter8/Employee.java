package chapter8;

public class Employee extends Person
				implements Employeeable{
	private double salary;
	private int hire;
	private String id;
	public Employee(){
		super();
		salary = 0.0;
		hire = 0;
		id = "none";
	}
	
	public Employee(String theName, double theSalary,
			int theHire, String theId){
		super(theName);
		salary = theSalary;
		hire = theHire;
		id = theId;
	}
	
	public void setSalary(double newSalary){
		salary = newSalary;
	}
	
	public void setHire(int newHire){
		hire = newHire;
	}
	
	public void setId(String newId){
		id = newId;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public int getHire(){
		return hire;
	}
	
	public String getId(){
		return id;
	}
	
	@Override
	public boolean equals(Object theOther){
		if (theOther instanceof Employee &&
				theOther != null)
			return false;
		Employee otherEmployee = (Employee)theOther;
		if ( this.getName().equals(otherEmployee.getName()) &&
				this.salary == otherEmployee.salary &&
				this.hire == otherEmployee.hire &&
				this.id == otherEmployee.id)
			return true;
		return false;
		
	}
}
