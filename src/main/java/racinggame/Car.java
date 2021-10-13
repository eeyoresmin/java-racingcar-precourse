package racinggame;

import nextstep.utils.Randoms;

/**
 * 자동차 객체
 * 이름(CarName), 위치(CarPosition)을 멤버로 가지고
 * 이동(move), 현재 상태 출력(displayCarStatus)하는 기능이 있다.
 *
 * @author  eeyoresmin
 * @version 1.0
 */
public class Car {
	private static final int START_NUM = 0;
	private static final int END_NUM = 9;
	private static final int BASIS_NUM = 4;
	private static final String DISPLAY_FORMAT = "%s : %s";

	private CarName carName;
	private CarPosition carPosition;

	public CarName getCarName() {
		return carName;
	}

	public CarPosition getCarPosition() {
		return carPosition;
	}

	public Car(CarName carName, CarPosition carPosition) {
		this.carName = carName;
		this.carPosition = carPosition;
	}

	public void move() {
		// 랜덤숫자가 기준보다 클 경우만 이동
		if (Randoms.pickNumberInRange(START_NUM, END_NUM) < BASIS_NUM) {
			return;
		}
		carPosition.movePosition();
	}

	public String displayCarStatus() {
		return String.format(DISPLAY_FORMAT, carName.getName(), carPosition.displayPosition());
	}
}
