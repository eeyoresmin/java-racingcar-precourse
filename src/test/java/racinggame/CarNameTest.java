package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

public class CarNameTest {

	@Test
	void 빈_이름_생성() {
		assertThatExceptionOfType(NullPointerException.class).isThrownBy(
			() -> new CarName(null)
		);
	}

	@Test
	void 긴_이름_생성() {
		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
			() -> new CarName("null12")
		);
	}

	@Test
	void 이름_생성() {
		assertThat(new CarName("Test").getName()).isEqualTo("Test");
	}
}
