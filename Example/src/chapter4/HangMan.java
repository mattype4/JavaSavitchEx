package chapter4;

/**
 * Creates a HangMan game that the user will
 * continue to guess 
 * <br> letters until the word if
 * figured out or the man is hung.
 * <p>
 * {@link java.io.PrintStream#println() HI}
 * 
 * @author Matthew Hill
 * @version 1.0
 * 
 */

import java.util.Scanner;

public class HangMan {
	
	private String word;
	private String disguised;
	int guessCnt, incCount;
	
	/**
	 * Constructor
	 */
	public HangMan(){
		word = "hello";
		disguised = "??????";
		guessCnt = incCount = 0;
	}
	
	/**
	 * The game that starts it all
	 */
	public void playGame(){
		String temp;
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Hello welcome to hangman!!!");
		System.out.println("You have 10 guesses for the game (incorrect ones):  ");
		System.out.println("Starting ...");
		System.out.println("The word is:  " + disguised);
		while (incCount!=10 && !isFound() ){
			System.out.println("Enter guess:  ");
			temp = kbd.next();
			makeGuess(temp.charAt(0));
			
			System.out.println("The word:  " + getDisguisedWord() );
		}
		if (incCount == 10)
			System.out.println("You lose!!!\nThe word was " + getSecretWord());
		else 
			System.out.println("Congratulations! You win!");
	}
	
	/**
	 * Allows the user to take a guess at
	 * <br> which letter may exist in the secret
	 * <br> word.
	 *  
	 * @param letter The letter to make a guess
	 * @return true if the letter exists and not if not
	 */
	private boolean makeGuess(char letter){
		String strLet = String.valueOf(letter).toLowerCase();
		String newDisguised = "";
		
		if (!word.contains(strLet)){
			System.out.println("Incorrect");
			guessCnt++;
			incCount++;
			return false;
		}
		else if (disguised.contains(strLet)){
			System.out.println("Already guessed that!");
			return true;
		}
		else{
			for (int i=0; i<word.length(); i++){
				if ( strLet.contains(word.substring(i, i+1)) )
					newDisguised += strLet;
				
				else
					newDisguised += disguised.substring(i, i+1);
			}
			System.out.println("Good guess!!!");
			disguised = newDisguised;
			guessCnt++;
		}
			
		return true;
	}
	
	/**
	 * The method is used to tell the user how much
	 * <br> of the word is correct.
	 * @return The partial word being guessed.
	 */
	private String getDisguisedWord(){
		return disguised;
	}
	
	/**
	 * A getter method for retrieving the secret word
	 * <br> Should never be used but for debugging
	 * @return The secret word.
	 */
	public String getSecretWord(){
		return word;
	}
	
	/**
	 * If this goes true, then the game is won.
	 * @return true if game is won, false if not
	 */
	private boolean isFound(){
		return disguised.equals(word);
	}
		
	
}
