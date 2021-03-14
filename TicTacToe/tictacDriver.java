package TicTacToe;


public class tictacDriver {
	public static void main(String[] args) {
		tictacMethods game = new tictacMethods();
		game.printBoard();
		while(!game.GameOver() && !game.filledBoard()) {
			game.placement();
		}
		if(game.filledBoard()) {
			System.out.println("The board was filled!!!!");
		}
	}
}
