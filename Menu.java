import java.util.*;

public class Menu {
	
	Scanner scan = new Scanner(System.in);
	
	public void showMenu() {
		
		char selection = 's';
		boolean selection_found = false;
		
		System.out.println("Welcome to Tic-Tac-Toe! Would you like to...");
		System.out.println("a. Start a new game");
		System.out.println("b. Load game from file");
		System.out.println("c. Exit");
		
		while (selection_found == false) {
			selection = scan.next().charAt(0);
			if (selection == 'a' || selection == 'b' || selection == 'c') {
				selection_found = true;
			}
			else {
				System.out.println("Please enter a, b, or c.");
			}
		}
		
		if (selection == 'a') {
			newGame();
		}
		else if (selection == 'b') {
			System.out.println("Function not yet added");
			return;
		}
		else if (selection == 'c') {
			return;
		}
		else {
			System.exit(0);
		}
	}
	
	public void newGame() {
		
		int players = 0;
		int difficulty = 0;
		boolean num_players_found = false;
		boolean difficulty_found = false;
		
		System.out.println("\nHow many players (1 or 2)?");
		while (num_players_found == false) {
			players = scan.nextInt();
			if (players == 1 || players == 2) {
				num_players_found = true;
			}
			else {
				System.out.println("Please enter 1 or 2.");
			}
		}
		
		if (players == 1) {
			System.out.println("\nWhat difficulty do you want to play on? Enter 1 for easy, 2 for medium, or 3 for hard.");
			while (difficulty_found == false) {
				difficulty = scan.nextInt();
				if (difficulty == 1 || difficulty == 2 || difficulty == 3) {
					difficulty_found = true;
				}
				else {
					System.out.println("Please enter 1, 2, or 3.");
				}
			}
		}
		
		System.out.println("Starting new game...\n");
		Game g = new Game(players, difficulty);
		g.start_game();
	}
}
