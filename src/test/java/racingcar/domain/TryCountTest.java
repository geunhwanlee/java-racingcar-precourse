package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TryCountTest {
	@DisplayName("이동 횟수를 생성한다")
	@Test
	void createTest() {
		assertThat(new TryCount("1")).isNotNull();
	}

	@DisplayName("이동 횟수는 숫자만 입력 가능")
	@Test
	void notNumberTest() {
		assertThatThrownBy(() -> new TryCount("a"))
				.isInstanceOf(IllegalArgumentException.class);
	}

	@DisplayName("이동 횟수는 0보다 큰 숫자여야 한다")
	@Test
	void over0Test() {
		assertThatThrownBy(() -> new TryCount("0"))
				.isInstanceOf(IllegalArgumentException.class);
		assertThat(new TryCount("1")).isNotNull();
	}
}
