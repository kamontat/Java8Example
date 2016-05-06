package com.kamontat.language.staticinterface;

import java.util.*;
import java.util.function.Supplier;

/**
 * @author kamontat
 * @since 7/5/59 - 01:30
 */
public interface Interface {
	String getName(String name);

	// full method in interface
	default void print(String a) {
		System.out.println("In Interface class: " + a);
	}

	// static method in interface
	static Comparator create(Supplier<Comparator> supplier) {
		return supplier.get();
	}
}
