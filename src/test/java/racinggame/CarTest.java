package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {
	private Car car;

	@BeforeEach
	void setUp() {
		car = new Car(new CarName("Test"), new CarPosition());
	}

	@Test
	@DisplayName("자동차 생성")
	void 자동차_생성() {

		assertThat(car.getCarName().getName()).isEqualTo("Test");
	}

	@Test
	@DisplayName("자동차 이동")
	void 자동차_이동() {
		car.move();
		assertThat(car.getCarPosition().getPosition()).isEqualTo(1);
	}
}
