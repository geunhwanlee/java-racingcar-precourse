package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarLocationTest {
	@DisplayName("자동차의 위치를 생성한다")
	@ParameterizedTest
	@ValueSource(ints = {0, 10})
	void createTest(int location) {
		assertThat(new CarLocation(location)).isNotNull();
	}

	@DisplayName("자동차의 위치는 마이너스가 될 수 없다")
	@Test
	void invalidLocationTest() {
		assertThatThrownBy(() -> new CarLocation(-1))
				.isInstanceOf(IllegalArgumentException.class);
	}
}
