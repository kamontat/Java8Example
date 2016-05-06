package com.kamontat.language.staticinterface;

/**
 * @author kamontat
 * @since 7/5/59 - 01:35
 */
public class Main {
	public static void main(String[] args) {
		UseInterface use1 = new UseInterface();
		use1.print("print me");

		UseDefaultInterface use2 = new UseDefaultInterface();
		// use2 Override print method from Interface
		use2.print("print me");
	}
}
