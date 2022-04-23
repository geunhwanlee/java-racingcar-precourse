package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomMove implements Movable {
	private static final int RANGE_FROM = 0;
	private static final int RANGE_TO = 9;
	private static final int MINIMUM_NUMBER_TO_MOVE = 4;

	@Override
	public boolean forward() {
		return Randoms.pickNumberInRange(RANGE_FROM, RANGE_TO) >= MINIMUM_NUMBER_TO_MOVE;
	}
}
