import java.util.Scanner;

public class HumanPlayer implements Player {
	
	Scanner scan;
	
	public Move getMove() {
		
		int x = 7;
		int y = 7;
		boolean x_coordinate_found = false;
		boolean y_coordinate_found = false;
		
		scan = new Scanner(System.in);
		
		System.out.println("Enter the x coordinate of your desired move.");
		while (x_coordinate_found == false) {
			x = scan.nextInt();
			if (x == 0 || x == 1 || x == 2) {
				x_coordinate_found = true;
			}
			else {
				System.out.println("Please enter 0, 1, or 2.");
			}
		}
		
		System.out.println("Enter the y coordinate of your desired move.");
		while (y_coordinate_found == false) {
			y = scan.nextInt();
			if (y == 0 || y == 1 || y == 2) {
				y_coordinate_found = true;
			}
			else {
				System.out.println("Please enter 0, 1, or 2.");
			}
		}
		
		Move m = new Move(x, y);
		return m;
	}
}
