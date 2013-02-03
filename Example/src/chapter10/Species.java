package chapter10;
import java.util.Scanner;
import java.io.Serializable;

public class Species implements Serializable, Comparable<Species> {

	private static final long serialVersionUID = -523385785922329316L;
	private String name;
	private int population;
	private double growthRate = 0;
	
	public Species(){
		name = "No name yet.";
		population = 0;
		growthRate = 0.0;
	}
	
	public Species(String theName, int thePopulation,
						double theGrowthRate){
		name = theName;
		population = thePopulation;
		growthRate = theGrowthRate;
	}
	
	public void setSpecies(String newName, int newPopulation,
								double newGrowthRate){
		name = newName;
		population = newPopulation;
		growthRate = newGrowthRate;
	}
	
	public String getName(){
		return name;
	}
	
	public int getPopulation(){
		return population;
	}
	
	public double getGrowthRate(){
		return growthRate;
	}

	public void readInput() {
		Scanner kbd = new Scanner(System.in);
		System.out.println("What is the species' name?");
		name = kbd.nextLine();
		System.out.println("What is the population of the species?");
		population = kbd.nextInt();
		while (population < 0){
			System.out.println("Population cannot be negative.");
			System.out.println("Reenter population:");
			population = kbd.nextInt();
		}
		System.out.println("Enter growth rate (%increase per year):");
		growthRate = kbd.nextDouble();
	}
	
	public void writeOutput(){
		System.out.println("name = " + name);
		System.out.println("Population = " + population);
		System.out.println("Growth rate = " + growthRate + "%");
	}
	
	public int predictPopulation(int years){
		int result = 0;
		double populationAmount = population;
		int count = years;
		while ( (count > 0) && (populationAmount > 0)){
			populationAmount = (populationAmount + (growthRate / 100) * populationAmount);
			count--;
		}
		if (populationAmount > 0)
			result = (int)populationAmount;
		return result;
	}
	
	public String toString(){
		return ("Name = " + name + "\n" +
				"Population = " + population + "\n" +
				"Growth Rate = " + growthRate + "%");
	}
	
	public boolean equals(Object theOther){
		if (!(theOther!=null && theOther instanceof Species))
			return false;
		Species otherSpecies = (Species)theOther;
		if (otherSpecies.name.equals(this.name) &&
				otherSpecies.population == this.population &&
				otherSpecies.growthRate == this.growthRate)
			return true;
		else
			return false;
	}
	
	public int compareTo(Species other){
		return this.name.compareTo(other.name);
	}
	

}
