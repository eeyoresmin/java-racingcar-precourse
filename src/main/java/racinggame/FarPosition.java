package racinggame;

/**
 * 가장 먼 위치 값을 가진 Class
 *
 * @author  eeyoresmin
 * @version 1.0
 */
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
