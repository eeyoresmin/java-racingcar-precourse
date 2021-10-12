package racinggame;

public class Car {

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
		carPosition.movePosition();
	}
}
