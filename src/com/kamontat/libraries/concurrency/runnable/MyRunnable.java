package com.kamontat.libraries.concurrency.runnable;

/**
 * @author kamontat
 * @since 11/5/59 - 00:25
 */
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Executing thread " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Thread myThread = new Thread(new MyRunnable(), "runner");

		myThread.start();
	}
}
