package racinggame;

public class CarPosition {
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

	@Override
	public String toString() {
		StringBuilder bar = new StringBuilder();
		for (int i = 0; i < position; i++) {
			bar.append("-");
		}

		return bar.toString();
	}
}
