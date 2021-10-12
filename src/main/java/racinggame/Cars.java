package racinggame;

import java.util.ArrayList;
import java.util.List;

public class Cars {
	private List<Car> cars;

	public Cars(InputCarNames inputCarNames) {
		cars = new ArrayList<>();

		for (String name : inputCarNames.changeNameList()) {
			cars.add(new Car(new CarName(name), new CarPosition()));
		}

		this.cars = cars;
	}

	public List<Car> getCars() {
		return cars;
	}

	public Car getCar(int idx) {
		return cars.get(idx);
	}

	public void sortCars() {
		cars.sort((a, b) -> a.getCarPosition().getPosition() > b.getCarPosition().getPosition() ? -1 : 1);
	}

	public FarPosition getFarPosition() {
		sortCars();

		return new FarPosition(cars.get(0).getCarPosition().getPosition());
	}

	public void play() {
		for (Car car: cars) {
			car.move();
			System.out.println(car.displayCarStatus());
			System.out.println();
		}
	}
}
