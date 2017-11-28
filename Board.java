import java.util.*;

public class Board {
	
	char[][] array;
	
	// Constructor
	public Board() {
		array = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = ' ';
			}
		}
	}
	
	public char[][] get_locations() {
		return array;
	}
	
	public void display_board() {
		System.out.println();
		System.out.print(" "); System.out.print(array[0][0]); System.out.print(" | "); System.out.print(array[0][1]); System.out.print(" | "); System.out.print(array[0][2]); System.out.print("\n");
		System.out.println("---|---|---");
		System.out.print(" "); System.out.print(array[1][0]); System.out.print(" | "); System.out.print(array[1][1]); System.out.print(" | "); System.out.print(array[1][2]); System.out.print("\n");
		System.out.println("---|---|---");
		System.out.print(" "); System.out.print(array[2][0]); System.out.print(" | "); System.out.print(array[2][1]); System.out.print(" | "); System.out.print(array[2][2]); System.out.print("\n");
		System.out.println();
	}
}
