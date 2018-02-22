import java.util.Random;

public class Dice {

	public static final int[] FACE = {1,2,3,4,5,6};
	private int face;

	public Dice() {
		face = 1;
	}

	public void roll() {
		face = FACE[new Random().nextInt(5)];
	}
	
	public int getFace() {
		return this.face;
	}
}
