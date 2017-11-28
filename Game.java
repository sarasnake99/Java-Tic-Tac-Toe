import java.util.*;

public class Game {
	
	int players;
	int difficulty;
	
	Player player1;
	Player player2;
	
	Board b;
	
	// Constructor
	public Game(int p, int d) {
		players = p;
		difficulty = d;
	}
	
	// Start a new game
	public void start_game() {
		
		player1 = new HumanPlayer();
		
		if (players == 1) {
			player2 = new AIPlayer();
		}
		else if (players == 2) {
			player2 = new HumanPlayer();
		}
		else {
			System.out.println("Error: invalid number of players!");
			System.exit(0);
		}
		
		b = new Board();
		
	}
	
}
