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
		long[] arrayOfLong = new long[100000000];
		Arrays.parallelSetAll(arrayOfLong, value -> ThreadLocalRandom.current().nextInt(1000000000));

		Arrays.stream(arrayOfLong).limit(10).forEach(i -> System.out.print(i + " "));
		System.out.println();

		watch.start();
		Arrays.sort(arrayOfLong);
		watch.stop();
		double arrayTime = watch.getElapsed();
		watch.printTime();
		watch.reset();

		watch.start();
		Arrays.parallelSort(arrayOfLong);
		watch.stop();
		double parallelTime = watch.getElapsed();
		watch.printTime();
		watch.reset();

		System.out.println("different time is ");
		if (arrayTime > parallelTime) {
			System.out.printf("array more than parallel: %.1f times", (arrayTime / parallelTime));
		} else if (arrayTime < parallelTime) {
			System.out.printf("array more than parallel: %.1f times", (parallelTime / arrayTime));
		} else {
			System.out.print("equals");
		}
	}
}
