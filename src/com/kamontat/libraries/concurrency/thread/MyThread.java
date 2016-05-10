package com.kamontat.libraries.concurrency.thread;

/**
 * @author kamontat
 * @since 11/5/59 - 00:18
 */
public class MyThread extends Thread {
	MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("Executing thread " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		MyThread thread = new MyThread("MyThread");
		// run thread of (this class)
		thread.start();
	}
}