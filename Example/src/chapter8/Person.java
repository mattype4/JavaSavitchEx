package chapter8;

public class Person implements Personable{
	private String name;
	
	public Person(){
		name = "No name yet";
	}
	
	public  Person(String theName){
		name = theName;
	}
	
	public void setName(String newName){
		name = newName;
	}
	
	public String getName(){
		return name;
	}
	
	public void writeOutput(){
		System.out.println("Name:  " + name);
	}
	
	public boolean hasSameName(Person otherPerson){
		return this.name.equals(otherPerson.name.toLowerCase());
	}
}
