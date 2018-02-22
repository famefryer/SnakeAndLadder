
public class Game {

	private Player[] players;
	private Dice dice;
	private Board board;

	private Player currentPlayer;
	private boolean ended;
	private int currentPlayerIndex = 0;
	private int currentFace = 0;


	public Game() {
		players = new Player[2];
		players[0] = new Player("P1");
		players[1] = new Player("P2");

		dice = new Dice();
		board = new Board();
		ended = false;
		board.addPiece(players[0].getpiece(), 0);
		board.addPiece(players[1].getpiece(), 0);
		currentPlayer = players[0];
	}
	
	public boolean isEnded() {
		return this.ended;
	}
	
	public void end() {
		this.ended = true;
	}
	public Player currentPlayer() {
		return this.players[currentPlayerIndex];
	}
	
	public void switchPlayer() {
		currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
	}
	
	public String currentPlayerName() {
		return players[currentPlayerIndex].getName();
	}
	
	public int currentPlayerPosition() {
		return board.getPiecePosition(currentPlayer().getpiece());
	}
	
	public int cuurentPlayerRollDice() {
		currentFace = currentPlayer().roll(dice);
		return 	currentFace;
	}
	public void currentPlayerMove() {
		currentPlayer.movePiece(board,currentFace );
	}
	
	public boolean currentPlayerWin() {
		return board.pieceIsGoal(currentPlayer().getpiece());
	}

}
