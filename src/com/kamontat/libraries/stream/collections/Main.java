package com.kamontat.libraries.stream.collections;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author kamontat
 * @since 8/5/59 - 00:12
 */
public class Main {
	public static void main(String[] args) {
		List<Stream.Task> tasks = Arrays.asList(new Stream.Task(Stream.Status.CLOSE, 5), new Stream.Task(Stream.Status.OPEN, 15), new Stream.Task(Stream.Status.CLOSE, 19), new Stream.Task(Stream.Status.OPEN, 22), new Stream.Task(Stream.Status.OPEN, 3), new Stream.Task(Stream.Status.CLOSE, 9), new Stream.Task(Stream.Status.OPEN, 31));

		// get only OPEN status
		double totalPoint = tasks.stream().filter(task -> task.getStatus() == Stream.Status.OPEN).mapToInt(Stream.Task::getPoint).sum();

		// print only OPEN status and sort by point
		tasks.stream().filter(task -> task.getStatus() == Stream.Status.OPEN).sorted((e1, e2) -> {
			if (e1.getPoint() > e2.getPoint()) return -1;
			else if (e1.getPoint() < e2.getPoint()) return 1;
			return 0;
		}).forEach(System.out::println);

		System.out.println("Total point: " + totalPoint);

		// another way to sum the point (can do any thing not just sum point)
		totalPoint = tasks.stream().mapToInt(Stream.Task::getPoint).reduce(0, Integer::sum);

		System.out.println("Total points (all tasks): " + totalPoint);

		// map task in group by status
		final Map<Stream.Status, List<Stream.Task>> map = tasks.stream().collect(Collectors.groupingBy(Stream.Task::getStatus));
		System.out.println(map);

		// variable in lambda must be final or effective final
		double finalTotalPoint = totalPoint;

		/*
			.mapToInt(variable -> doSomething) <- use variable(int) to doSomething and return int, and convert int to IntStream
			.mapToDouble(variable -> doSomething) <- use variable(double) to doSomething and return double, and convert double to DoubleStream
			.mapToLong(variable -> doSomething) <- use variable(long) to doSomething and return long, and convert longs to LongStream
			.mapToObj(variable -> doSomething) <- use variable(Object) to doSomething and return Object, and convert Object to Stream

			.stream() <- change List to Stream
			.asLongStream <- covert everything to LongStream
			.boxed() <- return Stream
			.collect() <- collect Stream to Collectors
		 */
		final Collection<String> result = tasks.stream().mapToInt(Stream.Task::getPoint).asLongStream().mapToDouble(value -> value / finalTotalPoint).boxed().mapToLong(value -> (long) (value * 100)).mapToObj(percent -> percent + "%").collect(Collectors.toList());

		// print result
		tasks.stream().forEach(task -> System.out.print(task.getPoint() + " , "));
		System.out.println();
		System.out.println(result);
	}
}
