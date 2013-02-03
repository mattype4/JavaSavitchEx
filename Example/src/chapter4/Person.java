package chapter4;

public class Person {
	private String name;
	private byte age;
	
	Person(){
		name = null;
		age = 0;
	}
	Person(String theName, byte theAge){
		name = theName;
		age = theAge;
	}
	public void setName(String newName){
		name = newName;
	}
	
	public void setAge(byte newAge){
		age = newAge;
	}
	
	public String getName(){
		return name;
	}
	
	public byte getAge(){
		return age;
	}
	
	public boolean hasSameAge(Person p){
		if (p==null)
			return false;
		return (this.age == p.age);
	}
	
	public boolean hasSameName(Person p){
		if (p == null)
			return false;
		return (this.name!=null && (this.name.equals(p.name)));
	}
	
	@Override
	public boolean equals(Object p){
		if (p==null)
			return false;
		else if (p.getClass() != this.getClass())
			return false;
		Person person = (Person)p;
		
		return ( (age == person.age) && ( (this==p) || 
				((this.name != null) && (this.name.equals(person.name))) ));
	}
	
	@Override
	public int hashCode(){
		int hash = 5;
		hash = hash * (int)age;
		hash = hash * 31 + (name == null ? 0:name.hashCode());
		return hash;
	}
}
