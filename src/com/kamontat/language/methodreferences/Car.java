package com.kamontat.language.methodreferences;

import java.util.function.Supplier;

/**
 * @author kamontat
 * @since 7/5/59 - 01:40
 */
public class Car {
	public static Car create(Supplier<Car> supplier) {
		return supplier.get();
	}

	/**
	 * normally method
	 */
	public void repair() {
		System.out.println(this + " has fixed.");
	}

	/**
	 * static method
	 */
	public static void Turbo(Car car) {
		System.out.println(car + " 500 km/hr.");
	}

	/**
	 * final as a parameter
	 */
	public void follow(final Car other) {
		System.out.println("I following " + other + " car.");
	}
}
