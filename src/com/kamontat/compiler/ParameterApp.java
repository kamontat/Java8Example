package com.kamontat.compiler;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @author kamontat
 * @since 7/5/59 - 14:38
 */
public class ParameterApp {
	public static void main(String[] args) throws NoSuchMethodException {
		Method method = ParameterApp.class.getMethod("runBy", String.class, int.class, double.class, String.class);
		for (final Parameter parameter : method.getParameters()) {
			System.out.println("Parameter: " + parameter.getType());
		}
	}

	public static void runBy(String a, int b, double c, String z) {
		System.out.println(a + b + z + c);
	}
}
