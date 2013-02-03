package chapter8;

public class Utility {
	public static void skipSpaces(int spaces){
		
	}
	
	public static void drawLine(int lines){
		
	}
	
	public static void drawVs(int lines){
		int lineNum = lines-1; // Spaces/line
		int numStars = 1; // num of stars/line

		/*
		 * first line (vertical)
		 */
		for (int j=0; j<lineNum; j++){
			System.out.print(" ");
		}
		System.out.print("*");
		for (int j=1; j<numStars; j++){
			System.out.print(" ");
		}
		
		System.out.println();
		
		for (int i=0; i<lines-1; i++){
			for (int j=1; j<lineNum; j++){
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j=1; j<numStars*2; j++){
				System.out.print(" ");
			}
			System.out.print("*");
			
			lineNum--;
			numStars++;
			System.out.println();
		}
		
		
	}
	
	public static void drawInverseV(int lines){
		int lineNum = 1;
		int numStars = lines-1;
		for (int i=lines-1; i>0; i--){

			for (int j=lineNum; j>0; j--){
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j=numStars*2; j>1; j--){
				System.out.print(" ");
			}
			System.out.print("*");
			
			lineNum++;
			numStars--;
			System.out.println();
		}
		
		lineNum = lines/2; // Spaces/line
		numStars = 1; // num of stars/line
		/*
		 * first line (vertical)
		 */
		for (int j=0; j<lines; j++){
			System.out.print(" ");
		}
		System.out.print("*");
		
	}
	
}
