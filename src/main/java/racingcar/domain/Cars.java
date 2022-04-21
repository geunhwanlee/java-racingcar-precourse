package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Cars {
	private final List<Car> cars;

	private Cars(List<Car> cars) {
		this.cars = Collections.unmodifiableList(cars);
	}

	public static Cars of(String[] names) {
		List<Car> cars = new ArrayList<>();
		for (String name : names) {
			cars.add(Car.of(name));
		}
		if (!isUnique(cars)) {
			throw new IllegalArgumentException("중복된 자동차가 존재합니다.");
		}
		return new Cars(cars);
	}

	private static boolean isUnique(List<Car> cars) {
		return new HashSet<>(cars).size() == cars.size();
	}
}
