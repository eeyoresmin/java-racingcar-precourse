package racinggame;

/**
 * 이동 시도할 횟수를 가진 객체
 *
 * @author  eeyoresmin
 * @version 1.0
 */
public class MoveTime {
	private int moveTime;

	public MoveTime(String moveTime) {
		validation(moveTime);
		this.moveTime = Integer.parseInt(moveTime);
	}

	public int getMoveTime() {
		return moveTime;
	}

	public boolean validation(String inputValue) {
		try {
			Integer.parseInt(inputValue);
			return true;
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			return false;
		}
	}
}
