package racingcar.domain;

import java.util.Objects;

public class Car {
	private static final CarLocation INITIAL_LOCATION = new CarLocation(0);
	private final CarName carName;
	private CarLocation carLocation;

	private Car(CarName carName, CarLocation carLocation) {
		this.carName = carName;
		this.carLocation = carLocation;
	}

	public static Car of(String name) {
		return new Car(new CarName(name), INITIAL_LOCATION);
	}

	public void move(Movable movable) {
		if (movable.forward()) {
			carLocation = carLocation.increase();
		}
	}

	public boolean win(Car that) {
		return carLocation.compareTo(that.carLocation) > 0;
	}

	public boolean draw(Car that) {
		return carLocation.compareTo(that.carLocation) == 0;
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
