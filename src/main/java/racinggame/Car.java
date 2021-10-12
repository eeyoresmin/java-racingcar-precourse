package racinggame;

import nextstep.utils.Randoms;

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
		if (Randoms.pickNumberInRange(START_NUM, END_NUM) < BASIS_NUM) {
			return;
		}
		carPosition.movePosition();
	}

	public String displayCarStatus() {
		return String.format(DISPLAY_FORMAT, carName.getName(), carPosition.displayPosition());
	}

	public String getWinnerName(FarPosition farPosition) {
		if (farPosition.isFarPosition(carPosition)) {
			return carName.getName();
		}

		return "";
	}
}
