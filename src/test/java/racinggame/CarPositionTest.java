package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarPositionTest {
	private CarPosition carPosition;

	@BeforeEach
	void setUp() {
		carPosition = new CarPosition();
	}

	@Test
	void 전진() {
		carPosition.movePosition();

		assertThat(carPosition.getPosition()).isEqualTo(1);

		carPosition.movePosition();

		assertThat(carPosition.getPosition()).isEqualTo(2);

		carPosition.movePosition();

		assertThat(carPosition.getPosition()).isEqualTo(3);
	}

	@Test
	void 전진_후_표시() {
		assertThat(carPosition.toString()).isEqualTo("");

		carPosition.movePosition();

		assertThat(carPosition.toString()).isEqualTo("-");

		carPosition.movePosition();

		assertThat(carPosition.toString()).isEqualTo("--");

		carPosition.movePosition();

		assertThat(carPosition.toString()).isEqualTo("---");
	}
}
