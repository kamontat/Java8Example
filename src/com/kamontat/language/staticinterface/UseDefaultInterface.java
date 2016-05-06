package com.kamontat.language.staticinterface;

/**
 * @author kamontat
 * @since 7/5/59 - 01:34
 */
public class UseDefaultInterface implements Interface {
	@Override
	public String getName(String name) {
		return name;
	}

	@Override
	public void print(String a) {
		System.out.println("In Use: " + a);
	}
}
