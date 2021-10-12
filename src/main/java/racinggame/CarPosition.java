package racinggame;

public class CarPosition {
	private static char DISPLAY_BAR = '-';
	private int position;

	public CarPosition() {
		this.position = 0;
	}

	public int getPosition() {
		return position;
	}

	public void movePosition() {
		position += 1;
	}

	public String displayPosition() {
		StringBuilder bar = new StringBuilder();
		for (int i = 0; i < position; i++) {
			bar.append(DISPLAY_BAR);
		}

		return bar.toString();
	}
}
