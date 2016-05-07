package com.kamontat.libraries.stream.collections;

/**
 * @author kamontat
 * @since 7/5/59 - 15:06
 */
class Stream {
	enum Status {
		OPEN, CLOSE;
	}

	static final class Task {
		private final Status status;
		private final int point;

		Task(Status status, int point) {
			this.status = status;
			this.point = point;
		}

		Status getStatus() {
			return status;
		}

		int getPoint() {
			return point;
		}

		@Override
		public String toString() {
			return "{status=" + status + " ,point=" + point + '}';
		}
	}
}
