package com.kamontat.timer;

/**
 * clock object that can run timer of the program
 *
 * @author kamontat
 * @since 10/5/59 - 00:54
 */
public class StopWatch {
	private long startTime;
	private long stopTime;

	public void start() {
		startTime = System.nanoTime();
	}

	public void stop() {
		stopTime = System.nanoTime();
	}

	public double getElapsed() {
		return (stopTime - startTime) * 1.0E-9;
	}

	public void printTime() {
		System.out.printf("Elapsed time is %.5f sec\n\n", getElapsed());
	}

	public void reset() {
		// reset time
		startTime = 0;
		stopTime = 0;
	}
}