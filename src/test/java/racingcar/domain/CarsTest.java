package racingcar.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarsTest {
	@DisplayName("자동차의 일급컬렉션을 생성한다")
	@Test
	void createTest() {
		String[] names = {"gunan", "k", "lee"};
		Assertions.assertThat(Cars.of(names)).isNotNull();
	}

	@DisplayName("모든 자동차는 서로 중복될 수 없다")
	@Test
	void notUniqueTest() {
		String[] names = {"gunan", "k", "gunan"};
		Assertions.assertThatThrownBy(() -> Cars.of(names))
				.isInstanceOf(IllegalArgumentException.class);
	}
}
