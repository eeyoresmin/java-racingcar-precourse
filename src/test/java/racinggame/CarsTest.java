package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarsTest {
	private InputCarNames inputCarNames;
	private Cars cars;

	@BeforeEach
	void setUp() {
		inputCarNames = new InputCarNames("가,나,다,라,마");
		cars = new Cars(inputCarNames);
	}

	@Test
	void 자동차들_생성() {
		assertThat(cars.getCar(0).getCarName().getName()).isEqualTo("가");
	}

	@Test
	void 자동차_거리순_정렬() {
		cars.getCar(2).move();
		cars.getCar(2).move();
		cars.sortCars();

		assertThat(cars.getCar(0).getCarPosition().getPosition()).isEqualTo(2);
	}

	@Test
	void 자동차_경주_나_우승출력() {
		ResultGame resultGame = new ResultGame(cars);

		cars.getCar(2).move();
		cars.getCar(2).move();

		cars.getCar(0).getCarPosition().movePosition();
		cars.getCar(0).getCarPosition().movePosition();
		cars.getCar(0).getCarPosition().movePosition();

		cars.getCar(1).getCarPosition().movePosition();
		cars.getCar(1).getCarPosition().movePosition();
		cars.getCar(1).getCarPosition().movePosition();
		cars.getCar(1).getCarPosition().movePosition();


		assertThat(resultGame.displayResult()).isEqualTo("최종 우승자는 나 입니다.");
	}

	@Test
	void 자동차_경주_가나_우승출력() {
		ResultGame resultGame = new ResultGame(cars);

		cars.getCar(2).move();
		cars.getCar(2).move();

		cars.getCar(0).getCarPosition().movePosition();
		cars.getCar(0).getCarPosition().movePosition();
		cars.getCar(0).getCarPosition().movePosition();
		cars.getCar(0).getCarPosition().movePosition();

		cars.getCar(1).getCarPosition().movePosition();
		cars.getCar(1).getCarPosition().movePosition();
		cars.getCar(1).getCarPosition().movePosition();
		cars.getCar(1).getCarPosition().movePosition();


		resultGame.aggregateWinners();
		assertThat(resultGame.displayResult()).isEqualTo("최종 우승자는 가,나 입니다.");
	}
}
