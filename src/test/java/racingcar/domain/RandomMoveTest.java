package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;

public class RandomMoveTest {
	private static final int MOVING_FORWARD = 4;
	private static final int STOP = 3;
	private RandomMove randomMove;

	@BeforeEach
	void setUp() {
		randomMove = new RandomMove();
	}

	@DisplayName("전진한다")
	@Test
	void forwardTest() {
		assertRandomNumberInRangeTest(
				() -> assertThat(randomMove.forward()).isTrue(),
				MOVING_FORWARD
		);
	}

	@DisplayName("멈춘다")
	@Test
	void stopTest() {
		assertRandomNumberInRangeTest(
				() -> assertThat(randomMove.forward()).isFalse(),
				STOP
		);
	}
}
