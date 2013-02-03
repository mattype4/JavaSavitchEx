package chapter11;

public class RecursiveMethods {
	
	public static int numDigits(int digit){
		if (digit < 0)
			digit = -digit;
		if (digit < 10)
			return 1;
		else
			return numDigits(digit/10)+1;
	}
	
	public static int sumArray(int[] arr, int index){
		
		if (index == 0)
			return arr[0];
		return sumArray(arr, index-1)+arr[index];
		
	}
	
	public static int factorial(int num){
		if (num == 0)
			return 1;
		if (num == 1)
			return 1;
		else {
			return factorial(num-1)*num;
		}
			
	}
	
	public static boolean palindrome(String word){
		word = word.toLowerCase().replace(".", "");
		word = word.replace("!", "");
		word = word.replace("?", "");
		word = word.replace(",", "");
		word = word.replace(" ", "");
		if(word.length() <= 1)
			return true;
		if(word.charAt(0) == word.charAt(word.length()-1))
			return palindrome(word.substring(1, word.length()-1));
		else
			return false;

	}
}
