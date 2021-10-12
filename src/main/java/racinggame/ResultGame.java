package racinggame;

import java.util.ArrayList;
import java.util.List;

public class ResultGame {
	private static final String MESSAGE_FORMAT = "최종 우승자는 %s 입니다.";
	private Cars cars;
	List<String> winners;

	public ResultGame(Cars cars) {
		this.cars = cars;
		this.winners = new ArrayList<>();
	}

	public void aggregateWinners() {
		FarPosition farPosition = cars.getFarPosition();

		for (Car car: cars.getCars()) {
			checkWinner(car, farPosition);
		}
	}

	public void checkWinner(Car car, FarPosition farPosition){
		if (farPosition.isFarPosition(car.getCarPosition())) {
			winners.add(car.getCarName().getName());
		}
	}

	public String displayResult() {
		return String.format(MESSAGE_FORMAT, String.join(",", winners));
	}
}
