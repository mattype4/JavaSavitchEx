package chapter8;

public abstract class ShapeBasics implements Shapeable{
	private int offset;
	public abstract void drawHere();
	
	public void setOffset(int newOffset){
		offset = newOffset;
	}
	
	public int getOffset(){
		return offset;
	}
	
	public void drawAt(int lineNumber){
		for (int i=0; i<lineNumber; i++){
			System.out.println();
		}
		drawHere();
	}
	
	
}
