package racinggame;

/**
 * 자동차 위치 객체
 *
 * @author  eeyoresmin
 * @version 1.0
 */
public class CarPosition {
	private static final char DISPLAY_BAR = '-';
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

	/**
	 * 현재 위치 값 만큼 '-'로 표시
	 *
	 * @return 위치 값 만큼의 '-'로된 문자열
	 */
	public String displayPosition() {
		StringBuilder bar = new StringBuilder();
		for (int i = 0; i < position; i++) {
			bar.append(DISPLAY_BAR);
		}

		return bar.toString();
	}
}
