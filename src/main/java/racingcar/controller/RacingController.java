package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.TryCount;
import racingcar.view.RacingView;

public class RacingController {
	public void race() {
		Cars cars = getCars();
		TryCount tryCount = getTryCount();
	}

	private Cars getCars() {
		try {
			String names = RacingView.inputNames();
			return Cars.of(names.split(","));
		}
		catch (IllegalArgumentException e) {
			RacingView.showError(e.getMessage());
			return getCars();
		}
	}

	private TryCount getTryCount() {
		try {
			String input = RacingView.inputTryCount();
			return new TryCount(input);
		}
		catch (IllegalArgumentException e) {
			RacingView.showError(e.getMessage());
			return getTryCount();
		}
	}
}
