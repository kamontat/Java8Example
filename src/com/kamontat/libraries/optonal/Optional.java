package com.kamontat.libraries.optonal;

/**
 * this lib created to solution NullPointerException
 *
 * @author kamontat
 * @since 7/5/59 - 14:55
 */
public class Optional {
	public static void main(String[] args) {
		int rand = (int) Math.ceil(Math.random() * 2);

		String name = null;
		if (rand == 1) {
			name = "net";
		}

		java.util.Optional<String> fullName = java.util.Optional.ofNullable(name);
		System.out.println(fullName.map(String::toString));
		System.out.println("Full Name is set? " + fullName.isPresent());
		System.out.println("Full Name: " + fullName.orElseGet(() -> "[none]"));
		System.out.println(fullName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));
	}
}
