package racinggame;

import java.util.ArrayList;
import java.util.List;

/**
 * 자동차의 배열 일급 콜렉션 객체
 *
 * 최종 거리를 쉽게 계산하기 위한 sort 기능,
 * 가장 먼 거리를 가진 FarPosition 객체 생성,
 * 자동차 게임 play 기능이 있다.
 *
 * @author  eeyoresmin
 * @version 1.0
 */
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

	/**
	 * 위치값 내림차순 기준으로 정렬
	 */
	public void sortCars() {
		cars.sort((a, b) -> a.getCarPosition().getPosition() > b.getCarPosition().getPosition() ? -1 : 1);
	}

	/**
	 * 위치값 내림차순 이후, 가장 처음 위치를 FarPosition 객체로 반환한다.
	 *
	 * @return 가장 먼 위치 값을 가진 FarPosition 객체
	 */
	public FarPosition getFarPosition() {
		sortCars();

		return new FarPosition(cars.get(0).getCarPosition().getPosition());
	}

	/**
	 * 자동차 게임 기능.
	 * 자동차 전진 시도 후, 현재 상태 출력
	 */
	public void play() {
		for (Car car: cars) {
			car.move();
			System.out.println(car.displayCarStatus());
		}
		System.out.println();
	}
}
