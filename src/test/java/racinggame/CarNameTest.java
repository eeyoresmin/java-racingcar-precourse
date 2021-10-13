package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarNameTest {
	@Test
	void 이름_생성() {
		assertThat(new CarName("Test").getName()).isEqualTo("Test");
	}
}
