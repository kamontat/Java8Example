package com.kamontat.libraries.concurrency.thread;

/**
 * @author kamontat
 * @since 11/5/59 - 00:08
 */
public class MainThread {
	public static void main(String[] args) {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State state = Thread.currentThread().getState();
		String threadGroupName = Thread.currentThread().getThreadGroup().getName();

		print(id, name, priority, state, threadGroupName);
	}

	private static void print(long id, String name, int priority, Thread.State state, String threadGroupName) {
		System.out.printf("id=%d, name=%s, priority=%d, state=%s, threadGroupName=%s", id, name, priority, state, threadGroupName);
	}
}
