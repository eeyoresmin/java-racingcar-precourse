package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class InputNumberTest {
	@Test
	void 문자변환() {
		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
			() -> new InputNumber("A,B,C,D, ")
		);
	}
}
