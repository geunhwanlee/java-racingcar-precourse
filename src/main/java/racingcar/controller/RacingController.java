package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.TryCount;
import racingcar.view.RacingView;

public class RacingController {
	public void race() {
		String names = RacingView.inputNames();
		Cars cars = Cars.of(names.split(","));
		String input = RacingView.inputTryCount();
		TryCount tryCount = new TryCount(input);
	}
}
