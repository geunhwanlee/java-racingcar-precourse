package racingcar.domain;

public class TryCount {
	int count;

	public TryCount(String input) {
		int count = parseInt(input);
		if (count <= 0) {
			throw new IllegalArgumentException("이동 횟수는 0보다 큰 숫자여야 합니다.");
		}
		this.count = count;
	}

	private int parseInt(String input) {
		try {
			return Integer.parseInt(input);
		}
		catch (NumberFormatException e) {
			throw new IllegalArgumentException("이동 횟수는 숫자만 입력 가능합니다.");
		}
	}
}
