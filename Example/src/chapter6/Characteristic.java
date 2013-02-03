package chapter6;

import java.util.Scanner;

public class Characteristic {
	private String description;
	private int rating;
	
	public Characteristic(){
		description = "Empty description.";
		rating = 0;
	}
	
	public String getDescription(){
		return description;
	}
	
	public int getRating(){
		return rating;
	}
	
	public double getCompatibility(Characteristic otherRating){
		if (isMatch(otherRating))
			return getCompatibilityMeasure(otherRating);
		else
			return 0;
	}
	
	private double getCompatibilityMeasure(Characteristic otherRating){
		double m;
		if(this.rating != 0 && otherRating.rating != 0){
			m = 1 - Math.pow((this.rating - otherRating.rating), 2)/81;
			return m;
		}		
		else
			return 0;
	}
	
	private boolean isMatch(Characteristic otherRating){
		return description.equals(otherRating.description);
	}
	
	private boolean isValid(int aRating){
		if (aRating <= 10 && aRating >= 1)
			return true;
		else
			return false;
	}
	
	public void setRating(int aRating){
		if (isValid(aRating))
			rating = aRating;
		else
			System.out.println("Incorrect rating");
	}
	
	public void setRating(){
		Scanner kbd = new Scanner(System.in);
		
		do {
		System.out.println("Enter a valid rating (1-10):  ");
		rating = kbd.nextInt();
		} while (!isValid(rating));
	}
}
