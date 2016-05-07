package com.kamontat.language.typeinference;

/**
 * @author kamontat
 * @since 7/5/59 - 14:25
 */
public class UseValue {
	public static void main(String[] args) {
		final Value<String> value = new Value<>();

		// in java 7 should write in form "Value.< String >defaultValue()"
		value.getOrDefault("22", Value.defaultValue());
	}
}
