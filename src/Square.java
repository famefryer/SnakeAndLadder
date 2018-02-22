import java.util.ArrayList;
import java.util.List;

public class Square {
	
	private List<Piece> pieces;
	private int number;
	private boolean goal;
	private int dest;
	private boolean isSpecialPiece;
	
	public Square(int number) {
		this.number = number;
		pieces = new ArrayList<Piece>();
		goal = false;
		isSpecialPiece = false;
	}
	
	public void setGoal(boolean goal) {
		this.goal = goal;
	}
	
	public void addPiece(Piece piece) {
		pieces.add(piece);
		
	}
	
	public void addSnakeOrLadder(int dest) {
		this.isSpecialPiece = true;
		this.dest = dest;
	}
	
	public int getDest() {
		return this.dest;
	}
	
	public boolean isSpecialPiece() {
		return isSpecialPiece;
	}
	
	public void removePiece(Piece piece) {
		pieces.remove(piece);
	}
	
	public boolean hasPiece(Piece piece) {
		return pieces.contains(piece);
	}
	
	public boolean isGoal() {
		return this.goal;
	}
	
	public int getNumber() {
		return this.number;
	}

}
