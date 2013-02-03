package chapter4;

public class BasketballGame {
	private String name1, name2;
	private int score1, score2;
	private boolean finished;
	
	/**
	 * Constructor for game
	 */
	public BasketballGame(){
		name1 = name2 = "";
		score1 = score2 = 0;
		finished = false;
	}
	
	/**
	 * Team 1 gets a point
	 */
	public void team1Score1(){
		score1++;
	}
	
	/**
	 * Team 2 gets a point
	 */
	public void team2Score1(){
		score2++;
	}
	
	/**
	 * Team 1 gets 2 points
	 */
	public void team1Score2(){
		score1+=2;
	}
	
	/**
	 * Team 2 gets 2 points
	 */
	public void team2Score2(){
		score2+=2;
	}
	
	/**
	 * Team 1 gets 3 points
	 */
	public void team1Score3(){
		score1+=3;
	}
	
	/**
	 * Team 2 gets 3 points
	 */
	public void team2Score3(){
		score2+=3;
	}
	
	/**
	 * Sets the game to finished
	 */
	public void isFinished(){
		finished = true;
	}
	
	/**
	 * Gives the score of team 1
	 * @return returns score of team 1
	 */
	public int scoreTeam1(){
		return score1;
	}
	
	/**
	 * Gives the score of team 2
	 * @return returns score of team 2
	 */
	public int scoreTeam2(){
		return score2;
	}
	
	/**
	 * Gives the name of the team winning
	 * @return the team that is winning
	 */
	public String winning(){
		if (score1 > score2)
			return name1;
		else if (score2 > score1)
			return name2;
		else
			return "Tied";
	}
	
	
	
	
}
