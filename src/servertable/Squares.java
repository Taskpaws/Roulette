package servertable;

public class Squares {
	private static final int[] BLACK = { 15, 4, 2, 17, 6, 13, 11, 8, 10, 24,
			33, 20, 31, 22, 29, 28, 35, 36 };
	private static final int[] RED = { 32, 19, 21, 25, 34, 27, 36, 30, 23, 5,
			16, 1, 14, 9, 18, 7, 12, 3 };
	private static final int[] GREEN = { 0 };

	private static final int[] EVEN = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22,
			24, 26, 28, 30, 32, 34, 36 };
	private static final int[] ODD = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21,
			23, 25, 27, 29, 31, 33, 35 };

	private static final int C_GREEN = 0;
	private static final int C_RED = 1;
	private static final int C_BLACK = 2;

	public int[] getGreen() {
		return Squares.GREEN;
	}

	public int[] getRed() {
		return Squares.RED;
	}

	public int[] getBlack() {
		return Squares.BLACK;
	}

	public int getColorGreen() {
		return Squares.C_GREEN;
	}

	public int getColorRed() {
		return Squares.C_RED;
	}

	public int getColorBlack() {
		return Squares.C_BLACK;
	}

	public int[] getEven() {
		return Squares.EVEN;
	}
	
	public int[] getOdd() {
		return Squares.ODD;
	}
	
	public int getColorForNumber(int number) {
		int color = getColorBlack();
		for(int i : getGreen()) {
			if(i == number) {
				color = getColorGreen();
			}
		}
		for(int i : getRed()) {
			if(i == number) {
				color = getColorRed();
			}
		}
		return color;
	}
}