import java.util.Scanner;

public class ConsoleUI {
	
	private Scanner sc = new Scanner(System.in);
	public ConsoleUI() {
	}
	
	public void start(Game game) {
		while(!game.isEnded()) {
			System.out.println("-------------");
			System.out.println(game.currentPlayerName() + "'s turn");
			System.out.println("Position "+game.currentPlayerPosition());
			System.out.println("Please hit enter to roll a die.");
			sc.nextLine();
			
			int face = game.cuurentPlayerRollDice();
			System.out.println("Dice face : "+face);
			game.currentPlayerMove();
			System.out.println(game.currentPlayerName()+"'s at "+game.currentPlayerPosition());
			
			if(game.currentPlayerWin()) {
				System.out.println(game.currentPlayerName()+" Win this game.");
				game.end();
				break;
			}
			game.switchPlayer();

		}
	}
	
	public static void main(String[] args) {
		new ConsoleUI().start(new Game());
	}

}
