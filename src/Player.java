
public class Player {
	private String name;
	private Piece piece;
	
	public Player(String name) {
		this.name = name;
		piece = new Piece();
	}
	public int roll(Dice dice) {
		dice.roll();
		return dice.getFace();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void movePiece(Board board,int steps) {
		board.movePiece(piece, steps);
	}
	
	public Piece getpiece() {
		return this.piece;
	}

}
