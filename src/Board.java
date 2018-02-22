import java.util.Random;

public class Board {

	public static final int SIZE = 64;

	private Square[] squares;

	public Board() {
		squares = new Square[SIZE];
		for (int i = 0; i < 64; i++) {
			squares[i] = new Square(i);
		}
		for (int i = 0; i < 10; i++) {
			int square = (new Random().nextInt(62));
			int dest = (new Random().nextInt(62));
			squares[square].addSnakeOrLadder(dest);
		}
		squares[squares.length - 1].setGoal(true);
	}

	public void addPiece(Piece piece, int pos) {
		squares[pos].addPiece(piece);
	}

	public void movePiece(Piece piece, int steps) {
		int pos = getPiecePosition(piece);
		squares[pos].removePiece(piece);
		int newPos = pos + steps;
		if (newPos > 63) {
			newPos = 63;
		}
		if (squares[newPos].isSpecialPiece()) {
			newPos = squares[newPos].getDest();
		}
		addPiece(piece, newPos);
	}

	public int getPiecePosition(Piece piece) {
		for (Square s : squares) {
			if (s.hasPiece(piece)) {
				return s.getNumber();
			}
		}
		return -1;
	}

	public boolean pieceIsGoal(Piece piece) {
		return squares[getPiecePosition(piece)].isGoal();
	}

}
