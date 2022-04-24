package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class RacingView {
	private static final String INPUT_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String INPUT_TRY_COUNT = "시도할 회수는 몇회인가요?";
	private static final String ERROR_PREFIX = "[ERROR] ";

	public static String inputNames() {
		System.out.println(INPUT_CAR_NAMES);
		return Console.readLine();
	}

	public static String inputTryCount() {
		System.out.println(INPUT_TRY_COUNT);
		return Console.readLine();
	}

	public static void showError(String message) {
		System.out.println(ERROR_PREFIX + message);
	}
}
