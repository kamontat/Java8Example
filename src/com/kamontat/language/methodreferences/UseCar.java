package com.kamontat.language.methodreferences;

import java.util.*;
import java.util.function.Supplier;

/**
 * @author kamontat
 * @since 7/5/59 - 01:45
 */
public class UseCar {
	public static void main(String[] args) {
		// this is old **version** when you want to create anonymous class
		final Car car = Car.create(new Supplier<Car>() {
			@Override
			public Car get() {
				return new Car();
			}
		});

		// this use lambda to create anonymous class
		final Car car1 = Car.create(() -> new Car());

		// this is **method references** to create new object in anonymous class
		final Car car2 = Car.create(Car::new);

		final List<Car> cars = Arrays.asList(car, car1, car2);

		// this is **method references** to use **normal** method
		cars.forEach(Car::repair);

		// this is **method references** to use **static** method
		cars.forEach(Car::Turbo);

		Car police = Car.create(Car::new);
		// this is **method references** to use **final** method
		cars.forEach(police::follow);

		/* The form of method references is
			Class<T>::new  <--  to create new object

			Class::method
			Class::static_method  <--  can use Both one or don't have parameter

			instance::method
		  */
	}
}
