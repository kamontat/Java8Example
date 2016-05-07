package com.kamontat.language.annotation.web;

import java.lang.annotation.*;

/**
 * @author kamontat
 * @since 7/5/59 - 14:32
 */
public class repeatAnnotation {

	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Filters {
		Filter[] value();
	}

	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	@Repeatable(Filters.class)
	public @interface Filter {
		String value();
	}

	@Filter("filter1")
	@Filter("filter2")
	public interface Filterable {

	}

	public static void main(String[] args) {
		for (Filter filter : Filterable.class.getAnnotationsByType(Filter.class)) {
			System.out.println(filter.value());
		}
	}
}