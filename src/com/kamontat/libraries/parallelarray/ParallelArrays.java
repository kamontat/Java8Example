package com.kamontat.libraries.parallelarray;

import com.kamontat.timer.StopWatch;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author kamontat
 * @since 10/5/59 - 00:16
 */
public class ParallelArrays {
	public static void main(String[] args) {
		StopWatch watch = new StopWatch();
		long[] arrayOfLong = new long[20000];
		Arrays.parallelSetAll(arrayOfLong, value -> ThreadLocalRandom.current().nextInt(1000000));
		Arrays.stream(arrayOfLong).limit(10).forEach(i -> System.out.print(i + " "));
		System.out.println();

		watch.start();
		Arrays.sort(arrayOfLong);
		watch.stop();
		watch.printTime();
		watch.reset();

		watch.start();
		Arrays.parallelSort(arrayOfLong);
		watch.stop();
		watch.printTime();
		watch.reset();
	}
}
