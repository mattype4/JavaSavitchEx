package chapter8;

public class LeftArrow {
	int tail, width;
	public LeftArrow(){
		tail = 1;
		width = 1;
	}
	
	public LeftArrow(int theTail, int theWidth){
		tail = theTail;
		width = theWidth;
	}
	
	public void drawHere(){
		int spaces = 0;
		for (int i=0; i<tail; i++)
			System.out.print(" ");
		System.out.print("*");
		System.out.println();
		
		for (int i=0; i<width; i++){
			
			/*
			 * Make room for the tail
			 */
			if (i==width-1)
				for (int j=0; j<tail; j++)
					System.out.print("*");
			else {
				for (int j=0; j<tail; j++){
					System.out.print(" ");
				}
			}
			
			/*
			 * Draw triangle
			 */
			System.out.print("*");
			for (int j=0; j<spaces;j++){
				System.out.print(" ");
			}
			System.out.print("*");
			spaces++;
			System.out.println();
		}
		spaces--;
		spaces--;
		for (int i=0; i<width-1; i++){
			for (int j=0; j<tail; j++){
				System.out.print(" ");
			}
			
			System.out.print("*");
			for (int j=0; j<spaces; j++){
				System.out.print(" ");
			}
			System.out.print("*");
			spaces--;
			System.out.println();
		}
		for (int i=0; i<tail; i++){
			System.out.print(" ");
		}
		System.out.print("*");
		System.out.println();
	}
}
