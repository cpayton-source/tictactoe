package TicTacToe;
import java.util.Scanner;
public class tictacMethods {
	Scanner keyboard = new Scanner(System.in);	
	private String[][] board = new String[][]
			{{" ", " ", " "}, 
			 {" ", " ", " "},
			 {" ", " ", " "}};
	private int placeCnt = 0;
	public void printBoard() {
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board[i].length; j++) {
				System.out.print(board[i][j] + ", ");
			}
			System.out.println();
		}
	}
	public void placement() {
		String index, index2;
		System.out.println("Please enter a row index: ");
		int row = Math.abs(keyboard.nextInt());
		System.out.println("Please enter a column index: ");
		int col = Math.abs(keyboard.nextInt());
		
		while(row>2||col>2) {
			System.out.println("Row and column must be under 3");
			System.out.println("Enter your row again: ");
			row = Math.abs(keyboard.nextInt());
			System.out.println("Enter your col again");
			col = Math.abs(keyboard.nextInt());
		}
		
		while(!board[row][col].equals(" ")) {
			System.out.println("Index " + row + ", " + col + " already has a value");
			System.out.println("Enter a new row index: ");
			row = keyboard.nextInt();
			System.out.println("Enter a new col index: ");
			col = keyboard.nextInt();
		}
		
		keyboard.nextLine();
		System.out.println("\nAre you X or O?");
		String place = keyboard.nextLine();
		
		while(!place.equalsIgnoreCase("X") && !place.equalsIgnoreCase("O")) {
			System.out.println("Your input was neither X nor O. please enter again");
			place = keyboard.nextLine();
		}
		if(place.equalsIgnoreCase("X")) {
			board[row][col] = "X";
			placeCnt+=1;
		}else if(place.equalsIgnoreCase("O")) {
			board[row][col] = "O";
			placeCnt+=1;
		}
		printBoard();
	}
	public boolean GameOver() {
		if(board[0][0]=="X"&&board[1][1]=="X"&&board[2][2]=="X") {
			System.out.println("X won the game!!!!");
			return true;
		}else if(board[0][0]=="O"&&board[1][1]=="O"&&board[2][2]=="O") {
			System.out.println("O won the game !!!!");
			return true;
		}else if(board[0][2]=="X"&&board[1][1]=="X"&&board[2][0]=="X") {
			System.out.println("X won the game !!!!");
			return true;
		}else if(board[0][2]=="O"&&board[1][1]=="O"&&board[2][0]=="O"){
			System.out.println("O won the game !!!!");
			return true;
		}else if(board[0][1]=="X"&&board[1][1]=="X"&&board[2][1]=="X"){
			System.out.println("X won the game !!!!");
			return true;
		}else if(board[0][1]=="O"&&board[1][1]=="O"&&board[2][1]=="O"){
			System.out.println("O won the game !!!!");
			return true;
		}else if(board[1][0]=="X"&&board[1][1]=="X"&&board[1][2]=="X"){
			System.out.println("X won the game !!!!");
			return true;
		}else if(board[1][0]=="O"&&board[1][1]=="O"&&board[1][2]=="O"){
			System.out.println("O won the game !!!!");
			return true;
		}else if(board[0][0]=="X"&&board[0][1]=="X"&&board[0][2]=="X"){
			System.out.println("X won the game !!!!");
			return true;
		}else if(board[0][0]=="O"&&board[0][1]=="O"&&board[0][2]=="O"){
			System.out.println("O won the game !!!!");
			return true;
		}else if(board[2][0]=="X"&&board[2][1]=="X"&&board[2][2]=="X"){
			System.out.println("X won the game !!!!");
			return true;
		}else if(board[2][0]=="O"&&board[2][1]=="O"&&board[2][2]=="O"){
			System.out.println("O won the game !!!!");
			return true;
		}else {
			return false;
		}
	}
	public boolean filledBoard() {
		return placeCnt==9;
	}
}
