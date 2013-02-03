package chapter8;

public interface Personable {
	public void setName(String newName);
	public String getName();
	public void writeOutput();
	public boolean hasSameName(Person otherPerson);
}
