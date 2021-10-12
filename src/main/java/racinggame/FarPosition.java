package racinggame;

public class FarPosition {
	private int position;

	public FarPosition(int position) {
		this.position = position;
	}

	public boolean isFarPosition(CarPosition carPosition){
		if (position == carPosition.getPosition()) {
			return true;
		}

		return false;
	}
}
