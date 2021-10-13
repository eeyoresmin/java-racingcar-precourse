package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class InputCarNamesTest {

	@Test
	void 자동차들_이름() {
		InputCarNames inputCarNames = new InputCarNames("a,b,c,d,e");
		assertThat(inputCarNames.getInputCarNames()).isEqualTo("a,b,c,d,e");
	}

	@Test
	void 빈_자동차_이름() {
		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
			() -> new InputCarNames("")
		);
	}

	@Test
	void 중간에_빈_자동차_이름() {
		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
			() -> new InputCarNames("A,B,,D,E")
		);
	}

	@Test
	void 중간에_공란_자동차_이름() {
		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
			() -> new InputCarNames("A,B, ,D,E")
		);
	}
}
