package chapter8;

public class Diamond extends ShapeBasics
						implements Diamondable{
	private int size;
	
	public Diamond(){
		size = 1;
	}
	
	public Diamond(int theSize){
		size = theSize;
	}
	
	public void set(int newSize){
		size = newSize;
	}
	
	public void drawHere(){
		Utility.drawVs(size);
		Utility.drawInverseV(size-1);
	}

}
