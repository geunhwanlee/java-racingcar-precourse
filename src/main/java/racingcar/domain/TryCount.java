package racingcar.domain;

public class TryCount {
	int count;

	public TryCount(int count) {
		if (count <= 0) {
			throw new IllegalArgumentException("이동 횟수는 0보다 큰 숫자여야 합니다.");
		}
		this.count = count;
	}
}
