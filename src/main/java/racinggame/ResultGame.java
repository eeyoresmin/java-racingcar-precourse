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

	/**
	 * 게임 결과 체크
	 */
	public void aggregateWinners() {
		FarPosition farPosition = cars.getFarPosition();

		for (Car car: cars.getCars()) {
			checkWinner(car, farPosition);
		}
	}

	/**
	 * 가장 먼거리와 일치하는 자동차의 이름 저장
	 *
	 * @param car
	 * @param farPosition
	 */
	private void checkWinner(Car car, FarPosition farPosition){
		if (farPosition.isFarPosition(car.getCarPosition())) {
			winners.add(car.getCarName().getName());
		}
	}

	/**
	 * 최종 우승 문자열
	 *
	 * @return 최종 우승 문자열
	 */
	public String displayResult() {
		return String.format(MESSAGE_FORMAT, String.join(",", winners));
	}
}
