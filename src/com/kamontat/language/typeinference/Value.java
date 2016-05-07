package com.kamontat.language.typeinference;

/**
 * @author kamontat
 * @since 7/5/59 - 14:22
 */
public class Value<T> {
	public static <T> T defaultValue() {
		return null;
	}

	public T getOrDefault(T value, T defaultV) {
		return (value != null) ? value: defaultV;
	}
}
