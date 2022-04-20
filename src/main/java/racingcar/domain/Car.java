package racingcar.domain;

import java.util.Objects;

public class Car {
	private final CarName carName;

	private Car(CarName carName) {
		this.carName = carName;
	}

	public static Car nameOf(String name) {
		return new Car(new CarName(name));
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Car car = (Car) o;
		return Objects.equals(carName, car.carName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(carName);
	}
}
